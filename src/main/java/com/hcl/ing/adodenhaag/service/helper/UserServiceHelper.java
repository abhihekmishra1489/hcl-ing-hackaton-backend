package com.hcl.ing.adodenhaag.service.helper;

import com.hcl.ing.adodenhaag.exception.UserNotFoundException;
import com.hcl.ing.adodenhaag.model.LoginResponse;
import com.hcl.ing.adodenhaag.model.User;
import com.hcl.ing.adodenhaag.repository.UserRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Component
@Slf4j
public class UserServiceHelper {

    private UserRepository userRepository;

    @Autowired
    public UserServiceHelper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Function<User, LoginResponse> getUserLoginResponseFunction(LoginResponse loginResponse) {
        return user -> {
            loginResponse.setRole(user.getRole());
            loginResponse.setUserId(user.getUserId());
            return loginResponse;
        };
    }

    public Predicate<User> getUserPredicate(User loginUser) {
        return user -> user.getUserEmail().equalsIgnoreCase(loginUser.getUserEmail()) && user.getPwd().equalsIgnoreCase(loginUser.getPwd());
    }

    public Supplier<UserNotFoundException> getUserNotFoundExceptionSupplier(User loginUser) {
        return () -> new UserNotFoundException("No User found :");
    }

    @CircuitBreaker(name = "UserService", fallbackMethod = "fallbackForGetUserDetails")
    public List<User> getUserDetails() {
        return Collections.unmodifiableList(userRepository.findAll());
    }

    public List<User> fallbackForGetUserDetails(Throwable t) {
        LOGGER.error("Inside fallbackForGetUserDetails, cause - {}", t.toString());

        return Collections.unmodifiableList(Arrays.asList(
                User.builder()
                        .id(10L)
                        .userEmail("dummy@gmail.com")
                        .pwd("dummyPwd")
                        .role("dummyRole")
                        .userId("dummyUserId")
                        .build()));
    }
}

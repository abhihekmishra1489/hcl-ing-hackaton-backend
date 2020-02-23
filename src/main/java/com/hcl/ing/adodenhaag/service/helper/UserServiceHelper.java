package com.hcl.ing.adodenhaag.service.helper;

import com.hcl.ing.adodenhaag.exception.UserNotFoundException;
import com.hcl.ing.adodenhaag.model.LoginResponse;
import com.hcl.ing.adodenhaag.model.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Component
public class UserServiceHelper {

    public Function<User, LoginResponse> getUserLoginResponseFunction(LoginResponse loginResponse) {
        return user -> {
            loginResponse.setRole(user.getRole());
            loginResponse.setUserId(user.getUserId());
            return loginResponse;
        };
    }

    public Predicate<User> getUserPredicate(User loginUser) {
        return user -> user.getUserEmail().equalsIgnoreCase(loginUser.getUserEmail());
    }

    public Supplier<UserNotFoundException> getUserNotFoundExceptionSupplier(User loginUser) {
        return () -> new UserNotFoundException("No User found with email :" + loginUser.getUserEmail());
    }
}

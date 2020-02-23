package com.hcl.ing.adodenhaag.service;

import com.hcl.ing.adodenhaag.exception.UserNotFoundException;
import com.hcl.ing.adodenhaag.model.LoginResponse;
import com.hcl.ing.adodenhaag.model.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.function.Predicate;

@Service
public class UserService {

    public LoginResponse validateLogin(User loginUser) {
        LoginResponse loginResponse = new LoginResponse();
        User user1 = new User();

        return user1.getUsers()
                .stream()
                .filter(getUserPredicate(loginUser))
                .map(getUserLoginResponseFunction(loginResponse))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("No User found with email :" + loginUser.getUserEmail()));
    }

    private Function<User, LoginResponse> getUserLoginResponseFunction(LoginResponse loginResponse) {
        return user -> {
            loginResponse.setRole(user.getRole());
            loginResponse.setUserId(user.getUserId());
            return loginResponse;
        };
    }

    private Predicate<User> getUserPredicate(User loginUser) {
        return user -> user.getUserEmail().equalsIgnoreCase(loginUser.getUserEmail());
    }

}

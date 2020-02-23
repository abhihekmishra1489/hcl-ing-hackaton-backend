package com.hcl.ing.adodenhaag.service;

import com.hcl.ing.adodenhaag.exception.UserNotFoundException;
import com.hcl.ing.adodenhaag.model.LoginResponse;
import com.hcl.ing.adodenhaag.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public LoginResponse validateLogin(User loginUser) {
        LoginResponse loginResponse = new LoginResponse();
        User user1 = new User();

        return user1.getUsers()
                .stream()
                .filter(user -> user.getUserEmail().equalsIgnoreCase(loginUser.getUserEmail()))
                .map(user -> {
                    loginResponse.setRole(user.getRole());
                    loginResponse.setUserId(user.getUserId());
                    return loginResponse;
                })
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("No User found with email :" + loginUser.getUserEmail()));
    }

}

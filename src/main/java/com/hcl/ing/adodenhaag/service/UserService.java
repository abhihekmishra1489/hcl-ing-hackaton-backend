package com.hcl.ing.adodenhaag.service;

import com.hcl.ing.adodenhaag.model.LoginResponse;
import com.hcl.ing.adodenhaag.model.User;
import com.hcl.ing.adodenhaag.service.helper.UserServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private UserServiceHelper userServiceHelper;

    @Autowired
    public UserService(UserServiceHelper userServiceHelper) {
        this.userServiceHelper = userServiceHelper;
    }

    public LoginResponse validateLogin(User loginUser) {
        LoginResponse loginResponse = new LoginResponse();
        User userInstance = new User();

        return userInstance.getUsers()
                .stream()
                .filter(userServiceHelper.getUserPredicate(loginUser))
                .map(userServiceHelper.getUserLoginResponseFunction(loginResponse))
                .findFirst()
                .orElseThrow(userServiceHelper.getUserNotFoundExceptionSupplier(loginUser));
    }
}

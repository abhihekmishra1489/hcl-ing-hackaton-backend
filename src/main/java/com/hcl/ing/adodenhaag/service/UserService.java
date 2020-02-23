package com.hcl.ing.adodenhaag.service;

import com.hcl.ing.adodenhaag.model.LoginResponse;
import com.hcl.ing.adodenhaag.model.User;
import com.hcl.ing.adodenhaag.repository.UserRepository;
import com.hcl.ing.adodenhaag.service.helper.UserServiceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class UserService {

    private UserServiceHelper userServiceHelper;
    private UserRepository userRepository;

    @Autowired
    public UserService(UserServiceHelper userServiceHelper, UserRepository userRepository) {
        this.userServiceHelper = userServiceHelper;
        this.userRepository = userRepository;
    }

    public LoginResponse validateLogin(User loginUser) {
        LoginResponse loginResponse = getLoginResponse();
        return getUserDetails()
                .stream()
                .filter(userServiceHelper.getUserPredicate(loginUser))
                .map(userServiceHelper.getUserLoginResponseFunction(loginResponse))
                .findFirst()
                .orElseThrow(userServiceHelper.getUserNotFoundExceptionSupplier(loginUser));
    }

    private LoginResponse getLoginResponse() {
        return new LoginResponse();
    }

    public List<User> getUserDetails() {
        return Collections.unmodifiableList(userRepository.findAll());
    }
}

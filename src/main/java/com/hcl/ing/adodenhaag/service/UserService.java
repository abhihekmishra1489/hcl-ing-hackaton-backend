package com.hcl.ing.adodenhaag.service;

import com.hcl.ing.adodenhaag.model.LoginResponse;
import com.hcl.ing.adodenhaag.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    public LoginResponse validateLogin(User loginUser) {
        LoginResponse loginResponse = new LoginResponse();
        User user1 = new User();
        List<User> users = user1.getUsers();

        System.out.println("deatils " + users);

        for (User userList : users) {
            if (userList.getUserEmail().equalsIgnoreCase(loginUser.getUserEmail())) {
                loginResponse.setRole(userList.getRole());
                loginResponse.setUserId(userList.getUserId());
            }
        }
        return loginResponse;

    }

}

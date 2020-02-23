package com.hcl.ing.adodenhaag.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String userEmail;
    private String pwd;
    @JsonIgnore
    private String role;
    @JsonIgnore
    private String userId;

    @JsonIgnore
    public List<User> getUsers() {
        List<User> usersList = Arrays.asList(new User("TestUser@gmail.com", "user123", "user", "U123"),
                new User("TestCustomer@gmail.com", "customer12345", "customer", "C12345"));
        return usersList;
    }

}

package com.hcl.ing.adodenhaag.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class User {


    private String userEmail ;
    private String pwd ;

    @JsonIgnore
    private String role ;

    @JsonIgnore
    private String userId ;

    public User() {
    }

    public User(String userEmail, String pwd, String role, String userId) {
        this.userEmail = userEmail;
        this.pwd = pwd;
        this.role = role;
        this.userId = userId;
    }

    @JsonIgnore
    public List<User> getUsers() {
        List<User> usersList = Arrays.asList(new User("TestUser@gmail.com" , "user123", "user" , "U123") ,
                new User("TestCustomer@gmail.com" , "customer12345" , "customer","C12345")) ;
        return usersList ;
    }

    @Override
    public String toString() {
        return "User{" +
                "userEmail='" + userEmail + '\'' +
                ", pwd='" + pwd + '\'' +
                ", role='" + role + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userEmail.equals(user.userEmail) &&
                pwd.equals(user.pwd) &&
                role.equals(user.role) &&
                userId.equals(user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userEmail, pwd, role, userId);
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

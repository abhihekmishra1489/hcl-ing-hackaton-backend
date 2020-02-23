package com.hcl.ing.adodenhaag.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String userEmail;
    private String pwd;
    @JsonIgnore
    private String role;
    @JsonIgnore
    private String userId;

    @JsonIgnore
    public List<User> getUsers() {
         User user1 = User.builder().id(1l).userEmail("TestUser@gmail.com").pwd("user123").role("user").userId("U123").build() ;
         User user2 = User.builder().id(2l).userEmail("TestCustomer@gmail.com").pwd("customer12345").role("customer").userId("C12345").build() ;
        return Collections.unmodifiableList(Arrays.asList(user1,user2));
    }

}

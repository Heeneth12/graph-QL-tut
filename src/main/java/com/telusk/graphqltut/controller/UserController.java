package com.telusk.graphqltut.controller;

import com.telusk.graphqltut.entiry.User;
import com.telusk.graphqltut.service.IUserReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserReg iUserReg;

    @QueryMapping(value = "users")
    public List<User> getUsers() {
        return iUserReg.getUser();
    }

//    @MutationMapping(value = "createUser")
//    public User createUser(@RequestBody User user) {
//        // Implement logic to create user using the provided details
//        return iUserReg.createUser(user);
//    }
}

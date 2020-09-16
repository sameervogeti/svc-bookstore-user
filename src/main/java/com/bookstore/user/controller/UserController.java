package com.bookstore.user.controller;

import com.bookstore.user.input.UserDetails;
import com.bookstore.user.model.User;
import com.bookstore.user.output.ValidUser;
import com.bookstore.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/v1/user/allusers")
    public List<User> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return users;
    }

    @PostMapping(value = "/v1/user/validateUser", consumes = "application/json", produces = "application/json")
    public ValidUser isValidUser(@RequestBody UserDetails userDetails) {
        ValidUser validUser=new ValidUser();
        String emailId = userDetails.getEmailId();
        String password = userDetails.getPassword();
        User user = userService.getUserByEmailAndPassword(emailId, password);
        if (user != null) {
            validUser.setValidUser(true);
            return validUser;
        }
        validUser.setValidUser(false);
        return validUser;
    }
}

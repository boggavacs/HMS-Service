package com.hms.experience.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hms.experience.entity.UserEntity;
import com.hms.experience.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public UserEntity getMethodName(@RequestBody UserEntity body) {
        return userService.insertUser(body);
    }

}

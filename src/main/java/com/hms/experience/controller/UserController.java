package com.hms.experience.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hms.experience.entity.UserEntity;
import com.hms.experience.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity body) {
        return userService.insertUser(body);
    }

    @GetMapping("/")
    public List<UserEntity> users() {
        return userService.getUsers();
    }

    @PostMapping("{id}")
    public UserEntity getUsersBiId(@PathVariable String id) {
        return userService.getUserById(id);
    }

}

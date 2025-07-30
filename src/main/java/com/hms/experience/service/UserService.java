package com.hms.experience.service;

import com.hms.experience.dao.UserDAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.experience.entity.UserEntity;

import jakarta.transaction.Transactional;

@Service
public class UserService implements Users {

    private UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional
    public UserEntity insertUser(UserEntity body) {
        userDAO.addUser(body);
        return body;
    }

    @Override
    @Transactional
    public UserEntity updateUser(UserEntity entity) {
        return userDAO.updateUser(entity);
    }

    @Override
    public List<UserEntity> getUsers() {
        List<UserEntity> users = userDAO.getUsers();
        return users;
    }

    @Override
    public UserEntity getUserById(String id) {
        return userDAO.getUserById(id);
    }

    @Override
    public Optional<UserEntity> getUsreByName(String userName) {
        return userDAO.getUsreByName(userName);
    }

}

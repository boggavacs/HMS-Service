package com.hms.experience.dao;

import java.util.List;
import java.util.Optional;

import com.hms.experience.entity.UserEntity;

public interface UserDAO {

    public List<UserEntity> getUsers();

    public UserEntity getUserById(String id);

    public Optional<UserEntity> getUsreByName(String userName);

    public UserEntity addUser(UserEntity userObject);

    public UserEntity updateUser(UserEntity userObject);

}

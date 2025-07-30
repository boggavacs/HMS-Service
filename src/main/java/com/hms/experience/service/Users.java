package com.hms.experience.service;

import java.util.List;
import java.util.Optional;

import com.hms.experience.entity.UserEntity;

public interface Users {

    UserEntity insertUser(UserEntity entity);

    UserEntity updateUser(UserEntity entity);

    List<UserEntity> getUsers();

    UserEntity getUserById(String id);

    Optional<UserEntity> getUsreByName(String userName);

}

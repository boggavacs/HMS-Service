package com.hms.experience.dao;

import com.hms.experience.entity.UserEntity;

public interface UserDAO {

    public UserEntity getUsers();

    public UserEntity getUserById(String id);

    public UserEntity getUsreByName(String userName);

    public UserEntity addUser(UserEntity userObject);

    public void updateUser(UserEntity userObject);

}

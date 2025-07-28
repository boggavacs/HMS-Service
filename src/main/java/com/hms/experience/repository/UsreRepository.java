package com.hms.experience.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.hms.experience.dao.UserDAO;
import com.hms.experience.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class UsreRepository implements UserDAO {

    private EntityManager entityManager;

    public UsreRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public UserEntity getUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsers'");
    }

    @Override
    public UserEntity getUserById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }

    @Override
    public UserEntity getUsreByName(String userName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsreByName'");
    }

    @Override
    @Transactional
    public UserEntity addUser(UserEntity user) {
        UserEntity addUser = new UserEntity();
        addUser.setUserName(user.getUserName());
        addUser.setEmail(user.getEmail());
        addUser.setFirstName(user.getFirstName());
        addUser.setLastName(user.getLastName());
        addUser.setActive(user.active());
        addUser.setPassword(user.getPassword());
        addUser.setAvatarUrl(user.getAvatarUrl());
        addUser.setRole(user.getRole());
        addUser.setCreatedAt(LocalDateTime.now());
        addUser.setUpdatedAt(LocalDateTime.now());
        addUser.setExpireAt(LocalDateTime.now());
        entityManager.persist(addUser);
        return addUser;
    }

    @Override
    public void updateUser(UserEntity userObject) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

}

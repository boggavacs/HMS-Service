package com.hms.experience.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.hms.experience.dao.UserDAO;
import com.hms.experience.entity.UserEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class UsreRepository implements UserDAO {

    private EntityManager entityManager;

    public UsreRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<UserEntity> getUsers() {
        TypedQuery<UserEntity> query = entityManager.createQuery("SELECT u FROM UserEntity u", UserEntity.class);
        return query.getResultList();
    }

    @Override
    public UserEntity getUserById(String id) {
        return entityManager.find(UserEntity.class, id);
    }

    @Override
    public Optional<UserEntity> getUsreByName(String userName) {
        TypedQuery<UserEntity> getUserByName = entityManager.createQuery(
                "SELECT u FROM UserEntity u WHERE u.userName = :userName", UserEntity.class);
        getUserByName.setParameter("userName", userName);
        return Optional.of(getUserByName.getSingleResult());
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        user.setExpireAt(LocalDateTime.now());
        entityManager.persist(user);
        return user;
    }

    @Override
    public UserEntity updateUser(UserEntity userObject) {
        userObject.setUpdatedAt(LocalDateTime.now());
        return entityManager.merge(userObject);
    }

}

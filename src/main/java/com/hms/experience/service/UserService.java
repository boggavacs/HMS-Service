package com.hms.experience.service;

import org.springframework.stereotype.Service;

import com.hms.experience.entity.UserEntity;
import com.hms.experience.repository.UsreRepository;

@Service
public class UserService {

    private UsreRepository usreRepository;

    public UserService(UsreRepository usreRepository) {
        this.usreRepository = usreRepository;
    }

    public UserEntity insertUser(UserEntity body) {
        usreRepository.addUser(body);
        return body;
    }

}

package com.UserService.User.Service.Impl;

import com.UserService.User.Exception.ResourceNotFoundException;
import com.UserService.User.Service.UserService;
import com.UserService.User.entities.UserEntity;
import com.UserService.User.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity getUser(String userId) {

        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        //generate unique userId
        String randomUserId = UUID.randomUUID().toString();
        userEntity.setId(randomUserId);
        return userRepository.save(userEntity);
    }
}

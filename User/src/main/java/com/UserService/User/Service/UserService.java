package com.UserService.User.Service;

import com.UserService.User.entities.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUser();
    UserEntity getUser(String userId);

    UserEntity createUser(UserEntity  userEntity);
}

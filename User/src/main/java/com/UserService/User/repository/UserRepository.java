package com.UserService.User.repository;

import com.UserService.User.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    //if u want any custom method then create here


}

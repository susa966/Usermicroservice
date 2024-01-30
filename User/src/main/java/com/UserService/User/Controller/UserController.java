package com.UserService.User.Controller;

import com.UserService.User.Service.UserService;
import com.UserService.User.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    //getall

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUser(){
      List<UserEntity> user=  userService.getAllUser();
      return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
    }

    //get one

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUser(@PathVariable String userId){
        UserEntity user=  userService.getUser(userId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
    }

    //create

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity){
        UserEntity userEntity1 = userService.createUser(userEntity);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userEntity1);
    }
}

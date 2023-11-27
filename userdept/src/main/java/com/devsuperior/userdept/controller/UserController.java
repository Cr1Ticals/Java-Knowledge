package com.devsuperior.userdept.controller;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> getAllUsers(){
       List<User> gettingUsers = repository.findAll();
        return gettingUsers;
    }
    @GetMapping(value ="/{id}")
    public User getUser(@PathVariable Long id){
        User gettingUser = repository.findById(id).get();
        return gettingUser;
    }
    @PostMapping
    public User postUser(@RequestBody User user){
        User posttingUser = repository.save(user);
        return posttingUser;
    }
}

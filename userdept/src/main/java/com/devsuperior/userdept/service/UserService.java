package com.devsuperior.userdept.service;

import com.devsuperior.userdept.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserRepository repository;


}

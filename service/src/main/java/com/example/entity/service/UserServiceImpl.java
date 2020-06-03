package com.example.entity.service;

import com.example.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUser() {
        return new User("Akash");
    }
}

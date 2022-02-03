package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable("user")
    public User getUser(String username) {
        System.out.println("==============incoming......==============");

        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");

        return user;
    }
    
}

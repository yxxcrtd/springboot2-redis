package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(value = "user", key = "#username", unless="#result == null") // 查询为空时，不缓存（默认空会缓存）
    public User getUser(String username) {
        System.out.println("==============incoming......==============");

        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");

        return user;
    }
    
}

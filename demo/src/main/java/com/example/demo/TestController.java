package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

	@GetMapping("")
	public Object test() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");

        redisTemplate.opsForValue().set("user", user);

		return redisTemplate.opsForValue().get("user");
	}
    
}

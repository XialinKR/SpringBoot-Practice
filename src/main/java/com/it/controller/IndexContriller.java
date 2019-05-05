package com.it.controller;

import com.it.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexContriller {

    @Value("${com.it.username}")
    private String username;

    @Value("${com.it.password}")
    private String password;

    @Autowired
    private User user;

    @GetMapping("/Index")
    public List<User> getUser(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setUsername("郭采洁");
        user.setPassword("123");
        list.add(user);
        System.out.println(username+password);
        return list;
    }

    @GetMapping("/username")
    public String getUsername(){
        return username;
    }

    @GetMapping("/user")
    public User getUser1(){
        return user;
    }

}

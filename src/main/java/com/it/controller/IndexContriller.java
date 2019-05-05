package com.it.controller;

import com.it.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IndexContriller {

    @GetMapping("/Index")
    public List<User> getUser(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setUsername("郭采洁");
        user.setPassword("123");
        list.add(user);
        return list;
    }
}

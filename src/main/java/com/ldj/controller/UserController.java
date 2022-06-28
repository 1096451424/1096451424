package com.ldj.controller;

import com.ldj.mapper.UserMapper;
import com.ldj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    @GetMapping("/test")
    public void test(){
        userService.test();
    }

    @GetMapping("/test2")
    public void test2(){
        userMapper.insertOne();
    }
}

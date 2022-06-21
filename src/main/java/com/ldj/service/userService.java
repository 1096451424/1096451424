package com.ldj.service;

import com.ldj.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class userService {

    @Autowired
    userMapper userMapper;

    @Transactional
    public void test(){
        userMapper.insertOne();
        throw new NullPointerException();
    }
}

package com.ldj.service;

import com.ldj.properties.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private MyProperties myProperties;

    public void test(){
        System.out.println(myProperties.getUserName());
    }

}

package com.ldj.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
public class UserService implements InitializingBean {

    OrderService orderService;

    private User admin;

    @PostConstruct
    public void a (){
        System.out.println("b");
    }

    @Transactional
    public void test(){
        System.out.println(admin);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("c");

    }
}

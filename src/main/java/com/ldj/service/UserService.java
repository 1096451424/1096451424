package com.ldj.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;


@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void test(){
        jdbcTemplate.execute("INSERT into t1 values('1','2','3','4');");
    }
}

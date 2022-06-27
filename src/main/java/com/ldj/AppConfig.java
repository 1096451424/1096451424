package com.ldj;

import com.ldj.properties.MyProperties;
import com.ldj.service.User;
import com.ldj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationPropertiesScan("com.ldj.properties")
public class AppConfig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    private MyProperties myProperties;


    public void test(){
        System.out.println(myProperties.getPassword());
    }



}

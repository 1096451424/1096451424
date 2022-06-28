package com.ldj;

import com.ldj.service.User;
import com.ldj.service.UserService;
import org.apache.ibatis.annotations.Property;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
         SpringApplication.run(MyApplication.class);
    }
}

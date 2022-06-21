package com.ldj;

import com.ldj.service.userService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(MyApplication.class);
        userService bean = configurableApplicationContext.getBean(userService.class);
        bean.test();
    }
}

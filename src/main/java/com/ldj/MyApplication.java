package com.ldj;

import com.ldj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(MyApplication.class);
        UserService bean = configurableApplicationContext.getBean(UserService.class);
        bean.test();

//        UserService userService = new UserService();
//        for( Field field : userService.getClass().getDeclaredFields()){
//            if (field.isAnnotationPresent(Autowired.class)){
//                System.out.println(field);
//            }
//        }
    }
}

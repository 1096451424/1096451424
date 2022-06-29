package com.ldj;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication implements ApplicationRunner {
    public static void main(String[] args) {
         SpringApplication.run(MyApplication.class,"--ldj=55666");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(args.getOptionValues("ldj"));
    }
}

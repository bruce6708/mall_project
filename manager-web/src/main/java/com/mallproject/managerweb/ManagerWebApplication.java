package com.mallproject.managerweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.mallproject.managerweb.domain")
@MapperScan("com.mallproject.managerweb.dao")
@SpringBootApplication
public class ManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerWebApplication.class, args);
        System.out.println("成功");
    }

}

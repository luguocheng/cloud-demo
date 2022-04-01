package com.lugc.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description:
 * @author: lugc
 * @time: 2022/3/31 16:45
 */
@SpringBootApplication
@MapperScan("com.lugc.user.mapper")
//@EnableEurekaClient
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.annotation.security.DenyAll;

@SpringBootApplication
@EnableEurekaServer
//此处为服务注册中心

public class DreamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamsApplication.class, args);
    }

}

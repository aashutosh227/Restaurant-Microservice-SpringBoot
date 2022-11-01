package com.aashutosh.dishInfoService.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.aashutosh.dishInfoService")
@EnableEurekaClient
public class DishInfoServiceApp {
    public static void main(String[] args){
        SpringApplication.run(DishInfoServiceApp.class);
    }
}

package com.buba.openFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.buba.openFeign.service")
public class OpenFeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignMain.class,args);
    }
}

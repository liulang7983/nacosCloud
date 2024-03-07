package com.classify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ming.li
 * @Date 2024/3/7 15:37
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClassifyMain {
    public static void main(String[] args) {
        SpringApplication.run(ClassifyMain.class,args);
    }
}

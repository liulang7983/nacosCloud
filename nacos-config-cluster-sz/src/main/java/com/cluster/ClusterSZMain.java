package com.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ming.li
 * @Date 2024/3/7 21:41
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ClusterSZMain {
    public static void main(String[] args) {
        SpringApplication.run(ClusterSZMain.class,args);
    }
}

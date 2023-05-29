package com.buba.payment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author ming.li
 * @date 2022/10/25 10:51
 */
@SpringBootApplication
//@RefreshScope
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class,args);
    }
}

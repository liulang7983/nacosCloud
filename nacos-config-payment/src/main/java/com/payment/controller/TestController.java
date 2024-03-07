package com.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ming.li
 * @Date 2024/3/7 13:47
 * @Version 1.0
 */
@RequestMapping("test")
@RestController
@RefreshScope
public class TestController {
    @Value("${info}")
    public String info;
    @RequestMapping("getInfo")
    public String getInfo(){
        return info;
    }
}

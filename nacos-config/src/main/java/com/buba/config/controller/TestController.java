package com.buba.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@RefreshScope
public class TestController {
    @Value("${info}")
    private String info;
    @RequestMapping("getInfo")
    public String getInfo(){
        return info;
    }
}

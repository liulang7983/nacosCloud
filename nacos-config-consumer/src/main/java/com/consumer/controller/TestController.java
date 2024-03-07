package com.consumer.controller;

import com.consumer.client.PaymenyService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PaymenyService paymenyService;
    @RequestMapping("test1")
    public String getInfo(){
        String getInfo = paymenyService.getInfo();
        return "本机的info:"+info+",payment的info:"+getInfo;
    }
}

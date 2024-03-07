package com.payment.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
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
    @NacosValue(value = "${info}",autoRefreshed = true)
    public String info;
    @RequestMapping("getInfo")
    public String getInfo(){
        return info;
    }
}

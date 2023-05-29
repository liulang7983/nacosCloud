package com.buba.payment.controller;


import com.buba.payment.service.PaymentService;
import com.buba.payment.service.TestThreadService;
import com.buba.springcloud.pojo.CommonResult;
import com.buba.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ming.li
 * @date 2022/10/21 16:56
 */
@RestController
@RequestMapping("/testThread")
@RefreshScope
public class TestThreadControler {

    @Autowired
    private TestThreadService testThreadService;


    @RequestMapping("/add/{name}")
    public CommonResult add(@PathVariable("name") String name){
        System.out.println("add name:"+name);
        testThreadService.add(name);
        return new CommonResult(200,"插入成功");
    }

    @RequestMapping("/threadAdd/{name}")
    public CommonResult threadAdd(@PathVariable("name") String name){
        System.out.println("threadAdd name:"+name);
        testThreadService.threadAdd(name);
        return new CommonResult(200,"插入成功");
    }

}

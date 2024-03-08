package com.cluster.controller;

import com.cluster.client.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ming.li
 * @Date 2024/3/8 9:32
 * @Version 1.0
 */
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping("test")
    public String test(){
        return paymentService.test();
    }
}

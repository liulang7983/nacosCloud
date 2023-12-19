package com.buba.openFeign.controller;

import com.buba.springcloud.pojo.CommonResult;
import com.buba.springcloud.pojo.Payment;
import com.buba.openFeign.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentControler {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        System.out.println("Payment:" + payment);
        return paymentService.create(payment);
    }

    @RequestMapping("/queryById/{id}")
    public CommonResult queryById(@PathVariable("id") Long id) {
        System.out.println("queryById:" + id);
        return paymentService.queryById(id);
    }
}

package com.buba.openFeign.service;

import com.buba.springcloud.pojo.CommonResult;
import com.buba.springcloud.pojo.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-provide-payment")
public interface PaymentService {

    @RequestMapping("/payment/create")
    CommonResult create(Payment payment);

    @RequestMapping("/payment/queryById/{id}")
    CommonResult queryById(@PathVariable("id") Long id);
}

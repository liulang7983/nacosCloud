package com.cluster.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ming.li
 * @Date 2024/3/8 9:34
 * @Version 1.0
 */
@FeignClient(value = "nacos-config-cluster-payment")
public interface PaymentService {

    @RequestMapping("/cluster/test")
    public String test();
}

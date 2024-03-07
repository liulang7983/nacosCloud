package com.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ming.li
 * @Date 2024/3/7 13:53
 * @Version 1.0
 */
@FeignClient(value = "nacos-config-payment")
public interface PaymenyService {
    @RequestMapping("/test/getInfo")
    public String getInfo();
}

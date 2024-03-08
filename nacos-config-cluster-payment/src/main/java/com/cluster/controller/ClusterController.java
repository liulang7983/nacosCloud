package com.cluster.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ming.li
 * @Date 2024/3/8 9:23
 * @Version 1.0
 */
@RestController
@RequestMapping("cluster")
public class ClusterController {

    @RequestMapping("test")
    public String test(){
        System.out.println("test");
        return "test";
    }
}

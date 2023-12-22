package com.lm.sentinel.controller;

import com.lm.sentinel.service.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("sentinel")
public class SentinelController {

    @Autowired
    private SentinelService sentinelService;

    @RequestMapping("test")
    public Map test() {
        Map map = new HashMap();
        map.put("test", "test");
        return map;
    }

    @RequestMapping("test1")
    public String test1() {
        return "test1";
    }

    @RequestMapping("save")
    public String save() {
        return sentinelService.save("save");
    }
}

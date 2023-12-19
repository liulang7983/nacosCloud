package com.buba.springclould.order.controller;


import com.buba.springcloud.pojo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ming.li
 * @date 2022/10/27 11:29
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static final String PAYMENT_URL="http://cloud-provide-payment/testThread";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public CommonResult add( String name){
        System.out.println("name:"+name);
        for (int i = 0; i < 50; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    String str=name+ finalI;
                    restTemplate.getForObject(PAYMENT_URL+"/add/"+str,CommonResult.class);
                }
            }).start();
        }
        return new CommonResult(200,"插入成功");
    }

    @RequestMapping("/threadAdd")
    public CommonResult threadAdd( String name){
        System.out.println("name:"+name);
        for (int i = 0; i < 50; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    String str=name+ finalI;
                    restTemplate.getForObject(PAYMENT_URL+"/threadAdd/"+str,CommonResult.class);
                }
            }).start();
        }
        return new CommonResult(200,"插入成功");
    }

}

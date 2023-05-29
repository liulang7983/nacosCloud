package com.buba.springclould.order.controller;


import com.google.common.collect.Lists;
import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.reactive.LoadBalancerCommand;
import com.netflix.loadbalancer.reactive.ServerOperation;
import rx.Observable;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * @author ming.li
 * @date 2022/10/27 9:57
 */
public class RibbonDemo {
    public static void main(String[] args) {
        List<Server> list= Lists.newArrayList(
                new Server("127.0.0.1",8001));
        BaseLoadBalancer baseLoadBalancer = LoadBalancerBuilder.newBuilder().buildFixedServerListLoadBalancer(list);
        for (int i = 0; i < 10; i++) {
            Object get = LoadBalancerCommand.builder().withLoadBalancer(baseLoadBalancer).build().submit(new ServerOperation<Object>() {
                @Override
                public Observable<Object> call(Server server) {
                    String add = "http://" + server.getHost() + ":" + server.getPort() + "/payment/getInfo";
                    System.out.println("调用地址:" + add);
                    URL url = null;
                    try {
                        url = new URL(add);
                        try {
                            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                            conn.setRequestMethod("GET");
                            conn.connect();
                            InputStream in = conn.getInputStream();
                            byte[] bytes = new byte[in.available()];
                            in.read(bytes);
                            return Observable.just(new String(bytes));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                    return null;
                }
            }).toBlocking().first();
            System.out.println("调用结果:"+get);
        }
    }
}

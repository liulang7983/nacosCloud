package com.buba.payment.service.impl;


import com.buba.payment.dao.TestThreadDao;
import com.buba.payment.dto.TestThread;
import com.buba.payment.service.TestThreadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ming.li
 * @date 2022/10/27 10:57
 */
@Service
public class TestThreadServiceImpl implements TestThreadService {

    public static ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(5,5,3L, TimeUnit.SECONDS,new LinkedBlockingDeque<>());

    @Autowired
    private TestThreadDao threadDao;

    @Override
    public void add(String name) {
        for (int i = 0; i < 200; i++) {
            TestThread thread=new TestThread();
            thread.setName(name);
            thread.setCount(i);
            thread.setDate(new Date());
            threadDao.add(thread);
        }
    }

    @Override
    public void threadAdd(String name) {
        threadPoolExecutor.submit(()-> {
            System.out.println("开始处理threadAdd:"+name);
            for (int i = 0; i < 200; i++) {
                TestThread thread=new TestThread();
                thread.setName(name);
                thread.setCount(i);
                thread.setDate(new Date());
                threadDao.add(thread);
            }
        });
    }
}

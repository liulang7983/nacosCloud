package com.lm.sentinel.service.impl;

import com.lm.sentinel.miOcr.MiImageOcrTask;
import com.lm.sentinel.miOcr.MiOcrThread;
import com.lm.sentinel.service.AbstractService;
import com.lm.sentinel.service.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class SentinelServiceImpl implements SentinelService {
    @Autowired
    private AbstractService abstractService;
    private ThreadPoolExecutor executor=new ThreadPoolExecutor(2,2,2000, TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
    @Override
    public String save(String s) {
        List<String> list=new ArrayList<>();
        list.add("pdf");
        list.add("png");
        MiImageOcrTask miImageOcrTask = new MiImageOcrTask(abstractService, 1, list);
        MiOcrThread ocrThread = new MiOcrThread(miImageOcrTask);
        executor.submit(ocrThread);
        return "成功";
    }
}

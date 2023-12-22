package com.lm.sentinel.miOcr;

import com.lm.sentinel.service.AbstractService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MiImageOcrTask extends AbstractMiOcr {
    public static final Logger logger = LoggerFactory.getLogger(MiImageOcrTask.class);
    private final AbstractService abstractService;

    public MiImageOcrTask(AbstractService abstractService, Integer count, List<String> list) {
        super(count, list);
        this.abstractService = abstractService;
    }

    @Override
    public Object onOcr(){
        logger.info("开始处理:"+count);
        return count;
    }
}

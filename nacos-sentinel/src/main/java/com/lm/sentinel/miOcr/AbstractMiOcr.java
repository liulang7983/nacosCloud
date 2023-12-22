package com.lm.sentinel.miOcr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public abstract class AbstractMiOcr {
    public static final Logger logger = LoggerFactory.getLogger(AbstractMiOcr.class);
    protected Integer count;
    protected List<String> list;

    public AbstractMiOcr(Integer count, List<String> list) {
        this.count = count;
        this.list = list;
    }

    public void MiOcr(){
        logger.info("开始处理:"+count);
        onOcr();
    }
    protected abstract Object onOcr();
}

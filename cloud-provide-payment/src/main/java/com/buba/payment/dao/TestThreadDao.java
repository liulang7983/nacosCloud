package com.buba.payment.dao;


import com.buba.payment.dto.TestThread;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ming.li
 * @date 2022/10/27 10:44
 */
@Mapper
public interface TestThreadDao {

    int add(TestThread testThread);
}

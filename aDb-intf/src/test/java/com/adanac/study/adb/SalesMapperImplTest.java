package com.adanac.study.adb;

import com.adanac.study.adb.bean.Sales;
import com.adanac.study.adb.intf.SalesMapper;
import com.adanac.study.adb.intf.impl.SalesMapperImpl;
import com.alibaba.fastjson.JSON;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by allen on 2017/3/17.
 */
@ContextConfiguration(locations = {"classpath:/config/test-spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SalesMapperImplTest {
    private Logger log = LoggerFactory.getLogger(SalesMapperImpl.class);

    @Autowired
    private SalesMapper salesMapper;
    @org.junit.Test
    public void insert() throws Exception {
        Sales record = new Sales();
        record.setYear(2018);
        record.setCountry("中国");
        record.setProduct("神舟");
        record.setProfit(3);
        int insert = salesMapper.insert(record);
        log.info(JSON.toJSONString(insert));
    }

    @org.junit.Test
    public void insertSelective() throws Exception {
        Sales record = new Sales();
        record.setYear(2018);
        record.setCountry("");
        record.setProduct("神舟");
        record.setProfit(3);
        int insert = salesMapper.insertSelective(record);
        log.info(JSON.toJSONString(insert));
    }

}
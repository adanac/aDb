package com.adanac.study.adb.intf.impl;

import com.adanac.study.adb.bean.Sales;
import com.adanac.study.adb.intf.SalesMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by allen on 2017/3/17.
 */
@Repository("salesMapper")
public class SalesMapperImpl extends SqlSessionDaoSupport implements SalesMapper {

    private static final String NAMESPACE = "mybatis.mapper.SalesMapper";

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public int insert(Sales record) {
        return getSqlSession().insert(NAMESPACE+".insert",record);
    }

    public int insertSelective(Sales record) {
        return getSqlSession().insert(NAMESPACE+".insertSelective",record);
    }

    public int updateBatchByFiled(String filed) {
        return 0;
    }
}

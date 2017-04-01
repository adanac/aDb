package com.adanac.study.adb.intf;


import com.adanac.study.adb.bean.Sales;

public interface SalesMapper {
    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insert(Sales record);

    /**
     * 添加
     *
     * @param record
     * @return
     */
    int insertSelective(Sales record);

    /**
     * 根据某个字段名批量更新记录
     *
     * @param filed
     * @return
     */
    int updateBatchByFiled(String filed);
}
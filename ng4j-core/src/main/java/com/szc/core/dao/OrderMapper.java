package com.szc.core.dao;

import com.szc.core.base.IBaseDao;
import com.szc.core.domain.Order;

public interface OrderMapper extends IBaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}
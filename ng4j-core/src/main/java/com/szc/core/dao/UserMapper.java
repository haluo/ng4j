package com.szc.core.dao;

import com.szc.core.base.IBaseDao;
import com.szc.core.domain.User;

public interface UserMapper extends IBaseDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
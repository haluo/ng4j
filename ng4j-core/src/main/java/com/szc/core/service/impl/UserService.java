package com.szc.core.service.impl;

import com.szc.core.dao.UserMapper;
import com.szc.core.domain.User;
import com.szc.core.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zhufeng on 15/8/21.
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserMapper userMapper;
//    @Resource
//    private IJedisClient jedisClient;


    @Override
    public User get(Integer id) {
//        jedisClient.get("");
        return userMapper.selectByPrimaryKey(id);
    }
}

package com.szc.core.service;

import com.szc.core.domain.User;

/**
 * Created by zhufeng on 15/8/21.
 */
public interface IUserService {

    public User get(Integer id);
    //真正的业务逻辑
}

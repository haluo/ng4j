package com.szc.core.base;

/**
 * Created by zhufeng on 15/8/24.
 */
public interface IJedisClient {
    void set(String key, String value);

    Object get(String key);
}

package com.szc.core.base;

import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhufeng on 15/8/24.
 */
//@Component
public class JedisClient implements IJedisClient{

    private  static ShardedJedis one;

    private synchronized void init(){
        if(  one == null ){
            List<JedisShardInfo> shards = Arrays.asList(
                    new JedisShardInfo("192.168.194.136", 80));

            ShardedJedisPool pool = new ShardedJedisPool(new JedisPoolConfig(), shards);
            one = pool.getResource();
        }
    }


    public Object get(String key) {
        return one.get(key);
    }

     public void set(String key, String value) {
        one.set(key, value);
    }



}

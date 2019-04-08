package com.example.demo.core.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class RedisUtils {

    @Autowired
    public RedisTemplate redisTemplate;

    public Object get(String key){
        Object o = redisTemplate.opsForValue().get(key);
        return o;
    }

    public Object put(String key,Object object){
        //redisTemplate.opsForHash().putAll(key, (Map) object);
        redisTemplate.opsForValue().set(key,object);
        return "插入成功";
    }
}

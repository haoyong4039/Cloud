package com.boot.feign.redis.hystrix;

import com.boot.feign.redis.IRedisFeign;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class RedisFeignHystrix implements IRedisFeign
{
    @Override
    public String set(String key, String value, int seconds)
    {
        return "redis set fail";
    }

    @Override
    public String set(Map<String, Object> map)
    {
        return "redis set fail";
    }
}

package com.boot.demo.feign.redis.hystrix;

import com.boot.demo.feign.redis.IRedisFeign;
import org.springframework.stereotype.Component;

@Component
public class RedisFeignHystrix implements IRedisFeign
{
    @Override
    public String set(String key, String value, int seconds)
    {
        return "redis set fail";
    }
}

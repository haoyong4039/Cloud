package com.boot.feign.redis.hystrix;

import com.boot.feign.redis.IRedisClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class RedisClientHystrix implements IRedisClient
{
    public String sendMessage(String message){
        return null;
    }
}

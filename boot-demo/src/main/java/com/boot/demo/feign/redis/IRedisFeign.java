package com.boot.demo.feign.redis;

import com.boot.demo.feign.redis.hystrix.RedisFeignHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "boot-redis",fallback = RedisFeignHystrix.class)
public interface IRedisFeign
{
    @RequestMapping(value = "/redis/set", method = RequestMethod.GET)
    public String set(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value, @RequestParam(value = "seconds") int seconds);
}


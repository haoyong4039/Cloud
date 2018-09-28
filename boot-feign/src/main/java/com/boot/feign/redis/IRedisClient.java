package com.boot.feign.redis;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "boot-redis", fallback = IRedisClient.class)
public interface IRedisClient
{
    @RequestMapping(value = "/send", method = RequestMethod.GET)
    String sendMessage(@RequestParam String message);
}

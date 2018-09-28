package com.boot.demo.feign.redis;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "boot-redis")
public interface ICommonFeign
{
    @RequestMapping(value = "/redis/common/test", method = RequestMethod.GET)
    String test(@RequestParam(value = "message") String message);
}

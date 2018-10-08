package com.boot.redis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController
{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public String set(@RequestParam String key, @RequestParam String value, @RequestParam int seconds)
    {
        logger.info("key:{},value:{},seconds:{}", key, value, seconds);

        return "redis set success";
    }
}

package com.boot.demo.controller;

import com.boot.feign.redis.IRedisFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/common")
public class CommonController
{

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private IRedisFeign iRedisFeign;

    /**
     * <pre>
     * <一句话功能简述>
     * 数据存储
     * <功能详细描述>
     * </pre>
     */
    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public void save()
    {
        String result = iRedisFeign.set("name", "Mr.hao", 60);

        logger.info("result:{}", result);
    }

}

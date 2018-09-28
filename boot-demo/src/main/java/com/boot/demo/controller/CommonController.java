package com.boot.demo.controller;

import com.boot.demo.feign.redis.ICommonFeign;
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
    private ICommonFeign iCommonFeign;

    /**
     * <pre>
     * <一句话功能简述>
     * feign测试
     * <功能详细描述>
     * </pre>
     *
     * @author haoyong
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void testRedis()
    {
        String message = "这是存储信息";

        String result = iCommonFeign.test(message);

        logger.info("result:{}", result);
    }

}

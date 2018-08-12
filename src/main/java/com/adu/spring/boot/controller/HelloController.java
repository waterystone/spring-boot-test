package com.adu.spring.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duyunjie
 * @date 2018/8/11 下午4:25
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("hello")
    public String hello() {
        logger.info("op=start_hello");
        return "Hello,World!";
    }
}

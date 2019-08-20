package com.maple.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试config动态修改配置
 */
@RestController
@RefreshScope
public class TestController {

    // 启动时从配置文件中读取key1为maple.test的value1值
    @Value("${maple.test}")
    private String test;

    @GetMapping("/test")
    public String test(){
        return "test:"+test;
    }

}
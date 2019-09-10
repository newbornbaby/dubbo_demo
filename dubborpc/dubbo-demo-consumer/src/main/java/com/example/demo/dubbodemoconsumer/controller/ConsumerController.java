package com.example.demo.dubbodemoconsumer.controller;

import com.example.demo.dubbodemoconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConsumerController.java
 * @Author spider
 * @Version 1.0.0
 * @Description http服务入口
 * @CreateTime 2019年09月09日 10:46:00
 */
@RestController
@RequestMapping(value="/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String sayHello() {
        return consumerService.doSayHello("word");
    }
}
package com.example.demo.dubbodemoconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dubbodemoapi.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * @ClassName ConsumerService.java
 * @Author spider
 * @Version 1.0.0
 * @Description 消费者rpc调用远程方法
 * @CreateTime 2019年09月09日 10:41:00
 */
@Component("consumerService")
public class ConsumerService {

    @Reference
    private DemoService demoService;

    public String doSayHello(String name) {
        return demoService.sayHello(name);
    }

}
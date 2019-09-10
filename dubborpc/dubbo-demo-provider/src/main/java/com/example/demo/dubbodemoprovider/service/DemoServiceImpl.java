package com.example.demo.dubbodemoprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dubbodemoapi.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoServiceImpl.java
 * @Author spider
 * @Version 1.0.0
 * @Description 服务实现类
 * @CreateTime 2019年09月09日 09:38:00
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
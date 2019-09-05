package com.example.demo.webService;

import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {
    @Override
    public String HelloWorld(String name) {
        return "Hello World!!------>" + name;
    }
}

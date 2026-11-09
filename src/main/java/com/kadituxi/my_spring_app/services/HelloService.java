package com.kadituxi.my_spring_app.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String helloWorld() {
        return "Hello, World!";
    }
}

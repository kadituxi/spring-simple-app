package com.kadituxi.my_spring_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kadituxi.my_spring_app.services.HelloService;
import com.kadituxi.my_spring_app.domain.User;

// @RestController
@Controller
@RequestMapping("/hello-world")
public class HelloWorldController {
    // @Autowired
    HelloService helloService;
    
    public HelloWorldController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello(Model model) {
        // return helloService.helloWorld();
        model.addAttribute("mensagem", "Olá, meus amores!");
        return "index";
    }

    @GetMapping("/{user_id}")
    public String getUser(@PathVariable("user_id") int user_id, @RequestParam(value = "filter", defaultValue = "Nenhum") String filter) {
        System.out.println(filter);
        return helloService.helloWorld();
    }

    @PostMapping
    public User helloFromPost(@RequestBody User user) {
        return user;
    }
}

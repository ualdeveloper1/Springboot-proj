package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping
    public String demo(){
        return "Welcome to springboot project";
    }
}

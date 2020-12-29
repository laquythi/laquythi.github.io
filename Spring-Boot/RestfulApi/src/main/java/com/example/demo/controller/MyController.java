package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController{
    // cach viet 1
     @RequestMapping(value="/hello-world",method = RequestMethod.GET)

    // cach viet 2
//    @GetMapping(value = "/hello-world")
    public User helloWorld(){
        User user = new User(2,"trang la");
        return user;
    }
}
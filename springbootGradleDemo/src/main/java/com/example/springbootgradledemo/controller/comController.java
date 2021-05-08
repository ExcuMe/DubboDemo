package com.example.springbootgradledemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class comController {

    @RequestMapping("/hello")
    @ResponseBody
    public Object hello(){
        System.out.println("HELLO WORLD GRADLE!");
        return "hello";
    }
}

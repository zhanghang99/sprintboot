package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.PersonProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.List;

@RestController
public class HelloController{
    @RequestMapping(value = "/login",method=RequestMethod.GET)
    public String hello(){
        return "hello world";
    }
    @RequestMapping(value = "/register",method=RequestMethod.GET)
    public String world(){
        return "world";
    }


    @Autowired
    private PersonProperties personProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return personProperties.getName()+personProperties.getAge();
    }
}
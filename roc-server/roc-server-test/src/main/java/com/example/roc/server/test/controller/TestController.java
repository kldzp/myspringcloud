package com.example.roc.server.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello() {
        return "Feign Test";
    }

}
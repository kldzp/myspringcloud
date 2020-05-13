package com.example.roc.client.test.controller;

import com.example.roc.client.test.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private IHelloService helloService;

    @RequestMapping()
    public String testFeign() {
        return helloService.hello();
    }

}

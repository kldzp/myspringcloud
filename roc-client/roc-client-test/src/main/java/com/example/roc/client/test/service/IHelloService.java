package com.example.roc.client.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component("IHelloService")
@FeignClient(value = "roc-server-test")
public interface IHelloService {

    @RequestMapping(value = "/test")
    String hello();
}

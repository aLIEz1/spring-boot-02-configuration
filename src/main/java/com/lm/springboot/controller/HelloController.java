package com.lm.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author super
 */
@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello" + name;
    }
}

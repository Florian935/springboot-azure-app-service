package com.dockerize.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String helloController() {
        return "Hey Hello Worlddddd'zer WOUHOUU TEST TEST";
    }


    @GetMapping("/azure")
    public String helloAzure() {
        return "Hello Azure App Serviceeeee";
    }
}

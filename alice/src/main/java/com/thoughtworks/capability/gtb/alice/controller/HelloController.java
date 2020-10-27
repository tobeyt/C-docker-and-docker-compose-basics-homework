package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    String URL = "http://bob:8081/hello";

    @GetMapping("/hello")
    public String hello() {
        return new RestTemplate().getForObject(URL, String.class);
    }
}

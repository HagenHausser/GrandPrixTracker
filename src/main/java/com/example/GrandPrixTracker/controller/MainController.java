package com.example.GrandPrixTracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")

public class MainController {
    @GetMapping(path = "/")
    public @ResponseBody String sayHello() {
        return "Hello World!";
    }
}

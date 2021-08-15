package com.mainapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller2 {
    int counter = 0;

    @GetMapping("/student")
    public String greeting(String name) {
        return "STUDENT YO";
    }
}



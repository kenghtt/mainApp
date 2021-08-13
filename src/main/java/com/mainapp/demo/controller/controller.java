package com.mainapp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {
    int counter = 0;

    @GetMapping("/greeting")
    public String greeting(String name) {
        return "tyutyu";
    }


    @GetMapping(value = "/student}")
    public String getTestData(Integer studentId) {


        return "Hi";
    }

}



package com.raj.example.eurekaclientdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySampleController {

    @RequestMapping("/hello")
    public String home() {
        return "Hello world";
    }

}

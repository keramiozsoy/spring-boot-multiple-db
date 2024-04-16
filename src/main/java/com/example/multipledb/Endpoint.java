package com.example.multipledb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}

package com.nongnogdev.portfolio.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String home()
    {
        return "Hello, nongnongdeve Portfolio API is running!";
    }
}

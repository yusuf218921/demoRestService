package com.restService.demoRestService.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demoRestController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello world";
    }
}

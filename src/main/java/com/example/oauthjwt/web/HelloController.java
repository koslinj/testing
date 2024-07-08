package com.example.oauthjwt.web;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(Authentication authentication) throws Exception {
        System.out.println("XXXXX");
        return "Hello, " + authentication.getName() + "!";
    }

}

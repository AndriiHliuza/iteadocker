package com.itea.andriihl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome to simple docker example application";
    }
}

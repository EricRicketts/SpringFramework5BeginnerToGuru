package com.example.controllers;

import com.example.services.GreetingService;
import com.example.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting() {
        return "Primary Injection: " + greetingService.sayGreeting();
    }
}

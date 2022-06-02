package com.example.controllers;

import com.example.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return "Setter Injection: " + greetingService.sayGreeting();
    }
}

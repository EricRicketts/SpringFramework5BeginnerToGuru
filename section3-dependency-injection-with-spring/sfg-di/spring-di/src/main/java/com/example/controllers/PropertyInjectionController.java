package com.example.controllers;

import com.example.services.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

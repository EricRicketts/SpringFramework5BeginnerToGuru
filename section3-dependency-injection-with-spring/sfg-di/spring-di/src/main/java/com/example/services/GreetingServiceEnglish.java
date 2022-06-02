package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceEnglish implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello, World!";
    }
}

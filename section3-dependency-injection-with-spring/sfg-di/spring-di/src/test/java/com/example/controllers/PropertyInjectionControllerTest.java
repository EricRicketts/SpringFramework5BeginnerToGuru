package com.example.controllers;

import com.example.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PropertyInjectionControllerTest {

    @Autowired
    ApplicationContext context;
    PropertyInjectionController controller;
    String expected;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService = new GreetingServiceEnglish();
    }

    @Test
    void getGreetingManuallyInjecting() {
        expected = "Property Injection: Hello, World!";
        assertEquals(expected, controller.getGreeting());
    }

    @Test
    void getGreetingSpringDependencyInjection() {
        expected = "Property Injection: Hello, World!  From Property Service.";
        controller = context.getBean("propertyInjectionController", PropertyInjectionController.class);
        assertEquals(expected, controller.getGreeting());
    }
}
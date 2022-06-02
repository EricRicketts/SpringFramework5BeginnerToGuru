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
class ConstructorInjectionControllerTest {

    @Autowired
    ApplicationContext context;
    ConstructorInjectionController controller;
    String expected;
    @BeforeEach
    void setUp() {
        expected = "Constructor Injection: Hello, World!";
        controller = new ConstructorInjectionController(new GreetingServiceEnglish());
    }

    @Test
    void sayGreetingManuallyInjecting() {
        assertEquals(expected, controller.getGreeting());
    }

    @Test
    void sayGreetingSpringDependencyInjection() {
        controller = context.getBean("constructorInjectionController", ConstructorInjectionController.class);
        assertEquals(expected, controller.getGreeting());
    }
}
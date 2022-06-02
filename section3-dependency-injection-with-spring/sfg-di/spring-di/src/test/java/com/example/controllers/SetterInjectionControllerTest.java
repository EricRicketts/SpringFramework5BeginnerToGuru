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
class SetterInjectionControllerTest {

    @Autowired
    ApplicationContext context;
    SetterInjectionController controller;
    String expected;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new GreetingServiceEnglish());
    }

    @Test
    public void sayGreetingManuallyInjecting() {
        expected = "Setter Injection: Hello, World!";
        assertEquals(expected, controller.getGreeting());
    }

    @Test
    public void sayGreetingSpringDependencyInjection() {
        expected = "Setter Injection: Hello, World!  From Setter Service.";
        controller = context.getBean("setterInjectionController", SetterInjectionController.class);
        assertEquals(expected, controller.getGreeting());
    }
}
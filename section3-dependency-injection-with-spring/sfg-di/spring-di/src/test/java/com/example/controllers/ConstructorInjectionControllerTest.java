package com.example.controllers;

import com.example.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;
    String expected;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new GreetingServiceEnglish());
    }

    @Test
    void sayGreeting() {
        expected = "Hello, World!";
        assertEquals(expected, controller.getGreeting());
    }
}
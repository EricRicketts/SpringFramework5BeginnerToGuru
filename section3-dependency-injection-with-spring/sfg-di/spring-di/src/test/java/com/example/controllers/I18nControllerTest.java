package com.example.controllers;

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
class I18nControllerTest {

    @Autowired
    ApplicationContext context;
    I18nController controller;
    String expected;
    @BeforeEach
    void setUp() {
        expected = "Hola Mundo - In Espanol.";
        controller = context.getBean("i18nController", I18nController.class);
    }

    @Test
    void getGreetingFromCurrentActiveProfile() {
        assertEquals(expected, controller.getGreeting());
    }
}
package com.example;

import com.example.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringDiApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void contextLoads() {
        MyController controller = context.getBean("myController", MyController.class);
        assertEquals("Hi, Folks!", controller.sayHello());
    }

}
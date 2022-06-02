package com.example;

import com.example.controllers.ConstructorInjectionController;
import com.example.controllers.MyController;
import com.example.controllers.PropertyInjectionController;
import com.example.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
        MyController myController = ctx.getBean("myController", MyController.class);
        System.out.println(myController.sayHello());

        System.out.println("----------------- Property Injection");
        PropertyInjectionController propertyInjectionController =
                ctx.getBean("propertyInjectionController", PropertyInjectionController.class);
        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("----------------- Setter Injection");
        SetterInjectionController setterInjectionController =
                ctx.getBean("setterInjectionController", SetterInjectionController.class);
        System.out.println(setterInjectionController.getGreeting());

        System.out.println("----------------- Constructor Injection");
        ConstructorInjectionController constructorInjectionController =
                ctx.getBean("constructorInjectionController", ConstructorInjectionController.class);
        System.out.println(constructorInjectionController.getGreeting());
    }

}

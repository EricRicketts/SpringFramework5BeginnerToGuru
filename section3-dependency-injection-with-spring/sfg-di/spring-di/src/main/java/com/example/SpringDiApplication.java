package com.example;

import com.example.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
        System.out.println("----------------- Primary Injection");
        MyController myController = ctx.getBean("myController", MyController.class);
        System.out.println(myController.getGreeting());

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

        System.out.println("----------------- Active Profile");
        I18nController i18nController = ctx.getBean("i18nController", I18nController.class);
        System.out.println(i18nController.getGreeting());

    }

}

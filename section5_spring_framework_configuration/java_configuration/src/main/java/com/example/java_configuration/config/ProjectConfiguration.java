package com.example.java_configuration.config;

import com.example.java_configuration.model.Parrot;
import com.example.java_configuration.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public Parrot parrot() {
        return new Parrot("Polly", 5);
    }

    @Bean
    public Person person(Parrot parrot) {
        return new Person("Joe", "Smith", 34, parrot);
    }
}

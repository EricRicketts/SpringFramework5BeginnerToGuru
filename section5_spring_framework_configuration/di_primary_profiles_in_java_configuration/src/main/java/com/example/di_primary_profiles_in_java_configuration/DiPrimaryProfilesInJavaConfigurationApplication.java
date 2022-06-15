package com.example.di_primary_profiles_in_java_configuration;

import com.example.di_primary_profiles_in_java_configuration.config.ProjectConfig;
import com.example.di_primary_profiles_in_java_configuration.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DiPrimaryProfilesInJavaConfigurationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Student student = context.getBean(Student.class);
        System.out.println(student.getFirstName());
        SpringApplication.run(DiPrimaryProfilesInJavaConfigurationApplication.class, args);
    }

}

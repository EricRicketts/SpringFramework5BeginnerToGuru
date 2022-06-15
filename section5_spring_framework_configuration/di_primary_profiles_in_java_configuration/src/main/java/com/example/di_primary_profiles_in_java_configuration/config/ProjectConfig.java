package com.example.di_primary_profiles_in_java_configuration.config;

import com.example.di_primary_profiles_in_java_configuration.model.Student;
import com.example.di_primary_profiles_in_java_configuration.model.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public Student firstStudent() {
        return new Student("Elmer", "Fudd", 32);
    }

    @Bean
    @Primary
    public Teacher firstTeacher() {
        return new Teacher("Foghorn", "Leghorn", 34, "Mathematics");
    }

    @Bean
    public Student secondStudent(Teacher firstTeacher) {
        Student student = new Student("Bugs", "Bunny", 30);
        student.addCourse(firstTeacher.getCourse(), firstTeacher);
        return student;
    }

    @Bean
    public Teacher secondTeacher(Student firstStudent) {
        Teacher teacher = new Teacher("Daffy", "Duck", 36, "English");
        teacher.addStudent(firstStudent);
        return teacher;
    }
}

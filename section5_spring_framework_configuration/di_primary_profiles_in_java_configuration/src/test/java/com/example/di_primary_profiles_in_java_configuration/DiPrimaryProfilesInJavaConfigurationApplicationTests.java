package com.example.di_primary_profiles_in_java_configuration;

import com.example.di_primary_profiles_in_java_configuration.model.Student;
import com.example.di_primary_profiles_in_java_configuration.model.Teacher;
import com.example.di_primary_profiles_in_java_configuration.config.ProjectConfig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.Map;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = ProjectConfig.class, loader = AnnotationConfigContextLoader.class)
@SpringBootTest
class DiPrimaryProfilesInJavaConfigurationApplicationTests {
    @Autowired
    private ApplicationContext context;
    Object[] expected, results;
    Student firstStudent, secondStudent;
    Teacher firstTeacher, secondTeacher;
    @BeforeEach
    public void setUp() {
        firstStudent = context.getBean(Student.class);
        firstTeacher = context.getBean(Teacher.class);
        secondStudent = context.getBean("secondStudent", Student.class);
        secondTeacher = context.getBean("secondTeacher", Teacher.class);
    }

    @Test
    void testDefaultStudent() {
        expected = new Object[]{"Elmer", "Fudd", 32};
        results = new Object[]{firstStudent.getFirstName(), firstStudent.getLastName(), firstStudent.getAge()};

        assertArrayEquals(expected, results);
    }

    @Test
    void testDefaultTeacher() {
        expected = new Object[]{"Foghorn", "Leghorn", 34, "Mathematics"};
        results = new Object[]{firstTeacher.getFirstName(), firstTeacher.getLastName(),
        firstTeacher.getAge(), firstTeacher.getCourse()};

        assertArrayEquals(expected, results);
    }

    @Test
    void testSecondStudent() {
        Map.Entry<String, Teacher> entry = secondStudent.getCourse("Mathematics");
        assertTrue(entry.getValue() instanceof Teacher);
    }
    
    @Test
    void testSecondTeacher() {
        assertTrue(secondTeacher.getStudent(0) instanceof Student);
    }
}

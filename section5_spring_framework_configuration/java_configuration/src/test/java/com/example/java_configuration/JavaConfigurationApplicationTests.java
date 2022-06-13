package com.example.java_configuration;

import com.example.java_configuration.model.Parrot;
import com.example.java_configuration.model.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JavaConfigurationApplicationTests {

    @Autowired
    ApplicationContext context;
    Object[] expected, results;

    @Test
    void testParrotBean() {
        expected = new Object[]{"Polly", 5};
        Parrot parrot = context.getBean("parrot", Parrot.class);
        results = new Object[]{parrot.getName(), parrot.getAge()};
        assertArrayEquals(expected, results);
    }

    @Test
    void testPersonBean() {
        expected = new Object[]{"Joe", "Smith", 34, "Polly", 5};
        Person person = context.getBean("person", Person.class);
        results = new Object[]{person.getFirstName(), person.getLastName(), person.getAge(),
        person.getParrot().getName(), person.getParrot().getAge()};
        assertArrayEquals(expected, results);
    }
}

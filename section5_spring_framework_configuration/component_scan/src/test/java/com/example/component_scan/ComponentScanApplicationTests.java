package com.example.component_scan;

import com.example.component_scan.controllers.PersonController;
import com.example.component_scan.controllers.PersonRestController;
import com.example.component_scan.model.Person;
import com.example.component_scan.repositories.PersonRepository;
import com.example.component_scan.repositories.PersonRepositoryList;
import com.example.component_scan.services.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
	this test illustrates the fact that SpringBoot will automatically scan for components in the main/java/top level
	package and below.  All allowable stereotype annotations were used in this exercise: @Component, @Controller,
	@RestController, @Service, and @Repository.  Since I was able to get all the beans from the context in the tests,
	Spring created an instance of each bean and inserted each one into the context.
*/
@ExtendWith(SpringExtension.class)
@SpringBootTest
class ComponentScanApplicationTests {

	@Autowired
	ApplicationContext context;
	Person person;
	PersonRepository personRepository;
	PersonService personService;
	PersonController personController;
	PersonRestController personRestController;

	@Test
	void testPersonBean() {
		person = context.getBean("person", Person.class);
		assertTrue(person instanceof Person);
	}

	@Test
	void testPersonRepositoryBean() {
		personRepository = context.getBean("personRepositoryList", PersonRepositoryList.class);
		assertTrue(personRepository instanceof PersonRepositoryList);
	}

	@Test
	void testPersonServiceBean() {
		personService = context.getBean("personService", PersonService.class);
		assertTrue(personService instanceof PersonService);
	}

	@Test
	void testPersonControllerBean() {
		personController = context.getBean("personController", PersonController.class);
		assertTrue(personController instanceof PersonController);
	}

	@Test
	void testPersonRestControllerBean() {
		personRestController = context.getBean("personRestController", PersonRestController.class);
		assertTrue(personRestController instanceof PersonRestController);
	}
}

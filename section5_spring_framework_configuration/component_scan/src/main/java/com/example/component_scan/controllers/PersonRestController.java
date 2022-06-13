package com.example.component_scan.controllers;

import com.example.component_scan.model.Person;
import com.example.component_scan.repositories.PersonRepository;
import com.example.component_scan.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

    final PersonService personService;

    @Autowired
    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/one_person")
    public Person getFirstPerson() {
        PersonRepository personRepository = personService.getPersonRepository();
        return personRepository.findById(0);
    }
}

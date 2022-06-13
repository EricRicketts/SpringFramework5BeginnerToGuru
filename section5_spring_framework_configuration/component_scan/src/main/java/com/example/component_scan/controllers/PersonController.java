package com.example.component_scan.controllers;

import com.example.component_scan.model.Person;
import com.example.component_scan.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.component_scan.repositories.PersonRepository;

import java.util.List;

@Controller
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping({"", "/", "/index", "index.html"})
    public String listPeople(Model model) {
        PersonRepository personRepository = personService.getPersonRepository();
        model.addAttribute("people", personRepository.findAll());

        return "index";
    }
}

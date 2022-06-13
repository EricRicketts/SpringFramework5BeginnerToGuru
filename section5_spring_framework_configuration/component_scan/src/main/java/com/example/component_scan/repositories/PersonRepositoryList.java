package com.example.component_scan.repositories;

import com.example.component_scan.model.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Primary
@Repository
public class PersonRepositoryList implements PersonRepository {

    List<Person> people = new ArrayList<Person>();
    {
        Person elmer = new Person();
        elmer.setFirstName("Elmer");
        elmer.setLastName("Fudd");
        elmer.setAge(32);
        people.add(elmer);
        Person bugs = new Person();
        bugs.setFirstName("Bugs");
        bugs.setLastName("Bunny");
        bugs.setAge(30);
        people.add(bugs);
        Person daffy = new Person();
        daffy.setFirstName("Daffy");
        daffy.setLastName("Duck");
        daffy.setAge(28);
        people.add(daffy);
    }

    public List<Person> findAll() {
        return people;
    }

    public Person add(Person person) {
        people.add(person);
        return person;
    }

    public Person findById(int id) {
        return people.get(id);
    }
}

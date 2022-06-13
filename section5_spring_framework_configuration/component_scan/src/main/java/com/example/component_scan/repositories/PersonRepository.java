package com.example.component_scan.repositories;

import com.example.component_scan.model.Person;
import java.util.List;

public interface PersonRepository {
    List<Person> findAll();

    Person add(Person  person);

    Person findById(int id);
}

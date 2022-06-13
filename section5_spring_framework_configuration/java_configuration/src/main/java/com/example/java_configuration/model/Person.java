package com.example.java_configuration.model;

public class Person {
    private final String firstName;
    private final String lastName;
    private int age;
    private Parrot parrot;

    public Person(String firstName, String lastName, int age, Parrot parrot) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.parrot = parrot;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}

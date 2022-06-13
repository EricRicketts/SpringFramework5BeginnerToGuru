package com.example.java_configuration.model;

public class Parrot {
    private final String name;
    private int age;

    public Parrot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

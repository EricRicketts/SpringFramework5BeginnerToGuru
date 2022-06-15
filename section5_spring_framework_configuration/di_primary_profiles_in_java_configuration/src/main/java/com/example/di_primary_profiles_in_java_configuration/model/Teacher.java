package com.example.di_primary_profiles_in_java_configuration.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private String course;
    private List<Student> students = new ArrayList<>();

    public Teacher(String firstName, String lastName, int age, String course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int index) {
        return students.get(index);
    }
}

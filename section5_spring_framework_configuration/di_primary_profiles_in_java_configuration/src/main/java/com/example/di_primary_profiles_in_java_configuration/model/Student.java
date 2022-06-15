package com.example.di_primary_profiles_in_java_configuration.model;

import java.util.HashMap;
import java.util.Map;

public class Student extends Person {

    private Map<String, Teacher> courses = new HashMap<>();

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Map<String, Teacher> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Teacher> courses) {
        this.courses = courses;
    }

    public void addCourse(String course, Teacher teacher) {
        courses.put(course, teacher);
    }

    public Map.Entry<String, Teacher> getCourse(String course) {
        for (Map.Entry<String, Teacher> entry:courses.entrySet()) {
            if (course.equals(entry.getKey())) return entry;
        }
        return null;
    }
}

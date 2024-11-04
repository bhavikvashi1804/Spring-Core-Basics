package com.bhv.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name = "Stephen Markins";


    private School school;

    public void setSchool(School school) {
        System.out.println("Setting school");
        this.school = school;
    }

    @Autowired
    public Student(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}

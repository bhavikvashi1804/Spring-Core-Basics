package com.bhv.app.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name = "Stephen Markins";

    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}

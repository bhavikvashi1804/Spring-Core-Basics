package com.bhv.app.model;

import org.springframework.stereotype.Component;

@Component
public class School {

    private String name = "St. Martin High School";

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}

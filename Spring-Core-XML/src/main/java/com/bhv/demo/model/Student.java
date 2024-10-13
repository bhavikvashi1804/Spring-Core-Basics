package com.bhv.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

    private int id;
    private String name;
    private int age;
    private Address address;
}

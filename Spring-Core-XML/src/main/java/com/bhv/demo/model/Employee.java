package com.bhv.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String department;

    public Employee(Long id,String name, String department) {
       this.id = id;
        this.name = name;
        this.department = department;

    }


    public Employee(String name, String department) {

        this.name = name;
        this.department = department;

    }


}

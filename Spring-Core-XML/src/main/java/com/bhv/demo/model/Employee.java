package com.bhv.demo.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String department;

}

package com.bhv.demo.autowire;

public class StudentDAO {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getData(){
        System.out.println("Data");
    }
}

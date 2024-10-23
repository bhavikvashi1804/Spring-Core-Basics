package com.bhv.demo.autowire;

public class StudentService {


    private StudentDAO studentDAO;

    public StudentService() {}

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void getData(){
        System.out.println("Inside getData method of Service");
        studentDAO.getData();
    }
}

package com.bhv.demo.autowire;

public class StudentService {


    private StudentDAO studentDAO;

    public StudentService() {
        System.out.println("Default constructor");
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        System.out.println("Setter called");
        System.out.println(studentDAO.getName());
        this.studentDAO = studentDAO;
    }



    public void getData(){
        System.out.println("Inside getData method of Service");
        studentDAO.getData();
    }
}

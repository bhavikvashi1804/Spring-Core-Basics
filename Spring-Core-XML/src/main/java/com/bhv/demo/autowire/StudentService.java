package com.bhv.demo.autowire;

public class StudentService {


    private StudentDAO studentDAO;

    public StudentService() {}

    public void setStudentDAO(StudentDAO studentDAO) {
        System.out.println("Setter called");
        this.studentDAO = studentDAO;
    }

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void getData(){
        System.out.println("Inside getData method of Service");
        studentDAO.getData();
    }
}

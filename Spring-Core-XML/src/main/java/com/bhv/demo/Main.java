package com.bhv.demo;

import com.bhv.demo.autowire.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");


       StudentService studentService = (StudentService) context.getBean("studentService");
       studentService.getData();
    }
}
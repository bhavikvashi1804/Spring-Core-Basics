package com.bhv.demo;

import com.bhv.demo.model.Employee;
import com.bhv.demo.scope.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee employee = (Employee) context.getBean("emp3");
        System.out.println(employee);
        Employee employee1 = (Employee) context.getBean("emp4");
        System.out.println(employee1);
    }
}
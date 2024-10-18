package com.bhv.demo;

import com.bhv.demo.scope.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("s1");
        System.out.println(student.hashCode());
        Student student1 = (Student) context.getBean("s1");
        System.out.println(student1.hashCode());

        Student student2 = (Student) context.getBean("s2");
        System.out.println(student2.hashCode());
        Student student3 = (Student) context.getBean("s2");
        System.out.println(student3.hashCode());

    }
}
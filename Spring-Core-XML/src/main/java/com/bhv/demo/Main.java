package com.bhv.demo;

import com.bhv.demo.lifecycle.Home;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Home home= applicationContext.getBean("home", Home.class);
        System.out.println(home);
    }
}
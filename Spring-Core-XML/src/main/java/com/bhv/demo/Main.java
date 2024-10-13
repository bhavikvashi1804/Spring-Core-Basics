package com.bhv.demo;

import com.bhv.demo.lifecycle.Home;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Home home= context.getBean("home", Home.class);
        System.out.println(home);
        context.registerShutdownHook();
    }
}
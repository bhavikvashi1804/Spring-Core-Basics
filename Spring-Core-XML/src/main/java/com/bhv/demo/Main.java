package com.bhv.demo;

import com.bhv.demo.lifecycle.Home;
import com.bhv.demo.lifecycle.Home1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();
        Home1 home= context.getBean("home1", Home1.class);
        System.out.println(home);
    }
}
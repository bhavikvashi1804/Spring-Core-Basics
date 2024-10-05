package com.bhv.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String appName = applicationContext.getBean(String.class);
        System.out.println(appName);
    }
}
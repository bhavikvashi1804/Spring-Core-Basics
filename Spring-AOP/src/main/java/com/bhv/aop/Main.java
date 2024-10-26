package com.bhv.aop;

import com.bhv.aop.config.AppConfig;
import com.bhv.aop.service.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(applicationContext.getBean("appName"));

        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        System.out.println(calculator.add(10l,20l));

    }
}
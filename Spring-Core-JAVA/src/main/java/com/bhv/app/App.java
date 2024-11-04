package com.bhv.app;

import com.bhv.app.config.*;
import com.bhv.app.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main(String[] args) {
        annotationBasedConfig();
    }

    static void javaBasedConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ctx.getBean(Person.class));
    }


    static void annotationBasedConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig1.class);
        System.out.println(ctx.getBean(Student.class));
    }
}

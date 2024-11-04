package com.bhv.app;

import com.bhv.app.config.AppConfig;
import com.bhv.app.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(ctx.getBean(Person.class));

    }
}

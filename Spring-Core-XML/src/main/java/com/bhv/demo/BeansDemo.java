package com.bhv.demo;

import com.bhv.demo.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansDemo {

    public void demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String appName = applicationContext.getBean(String.class);
        System.out.println(appName);

        Employee emp1= applicationContext.getBean("emp1", Employee.class);
        System.out.println(emp1);

        Employee emp2= applicationContext.getBean("emp2", Employee.class);
        System.out.println(emp2);

        Hospital hosp1= applicationContext.getBean("hosp1", Hospital.class);
        System.out.println(hosp1);

        CarDealer carDealer= applicationContext.getBean("carDealer1", CarDealer.class);
        System.out.println(carDealer);

        Customer customer1= applicationContext.getBean("customer1", Customer.class);
        System.out.println(customer1);

        Languages languages= applicationContext.getBean("lang1", Languages.class);
        System.out.println(languages);

        Student student1= applicationContext.getBean("student1", Student.class);
        System.out.println(student1);

        Student student2= applicationContext.getBean("student2", Student.class);
        System.out.println(student2);

    }
}

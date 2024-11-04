package com.bhv.app.config;


import com.bhv.app.model.Person;
import com.bhv.app.model.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW M5");
        return vehicle;
    }

    @Bean
    Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Joffers Kane");
        person.setVehicle(vehicle);
        return person;
    }

}

package com.bhv.cis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudIdentityServiceApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CloudIdentityServiceApp.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Cloud Identity Service Application Started");


    }
}

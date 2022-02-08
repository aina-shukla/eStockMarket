package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCompanyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyCompanyApplication.class, args);
		System.out.println("Company app started..");
	}
	
}

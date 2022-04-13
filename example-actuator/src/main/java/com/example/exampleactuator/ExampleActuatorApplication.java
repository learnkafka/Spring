package com.example.exampleactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleActuatorApplication {

	public static void main(String[] args) {
		System.out.println("welcome");
		SpringApplication.run(ExampleActuatorApplication.class, args);
	}

}

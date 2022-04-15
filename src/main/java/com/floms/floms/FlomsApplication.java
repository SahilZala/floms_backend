package com.floms.floms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlomsApplication {

	public static void main(String[] args) {
		
		System.out.println("log: server intialized");
		SpringApplication.run(FlomsApplication.class, args);
	}

}

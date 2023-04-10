package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("the application execution has started at :: "+System.currentTimeMillis());
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("the application execution has ended at :: "+System.currentTimeMillis());
	}

}

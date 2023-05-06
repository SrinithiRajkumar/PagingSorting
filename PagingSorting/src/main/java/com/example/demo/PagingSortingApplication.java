package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("module=service")
public class PagingSortingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagingSortingApplication.class, args);
	}

}

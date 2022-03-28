package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("rot10");
	}

}

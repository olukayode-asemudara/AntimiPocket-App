package com.antimiapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class AntimiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AntimiApplication.class, args);
	}

	@GetMapping("/")
	String helloWorld(){
		return "Hello World";
	}
}

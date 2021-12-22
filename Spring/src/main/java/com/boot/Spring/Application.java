package com.boot.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
@RequestMapping("/hai")
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("hello");
	}

}

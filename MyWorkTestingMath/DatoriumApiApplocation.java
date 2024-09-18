package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

	public static void main(String[] args) {
		var mathService = new MathService();

		// Example usage of sum method
		System.out.println("Sum of 50 and 40: " + mathService.sum(20, 75));  // Should return 95
		System.out.println("Sum of 60 and 50: " + mathService.sum(70, 35));  // Should return 0
		SpringApplication.run(DatoriumApiApplication.class, args);
	}
}

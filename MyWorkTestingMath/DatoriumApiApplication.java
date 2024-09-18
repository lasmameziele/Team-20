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
		System.out.println("Sum of 20 and 75: " + mathService.sum(20, 75));  // Should return 95
		System.out.println("Sum of 70 and 35: " + mathService.sum(70, 35));  // Should return 0
		System.out.println("Sum of 99 and 2: " + mathService.sum(99, 2));	// Should still return 0
		SpringApplication.run(DatoriumApiApplication.class, args);
	}
}

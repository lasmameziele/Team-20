package com.datorium.Datorium.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin
public class DatoriumApiApplication {

    public static void main(String[] args) {
        var userService = new UserService();

        userService.getFullName( "Lelde",  "Brosova");

        System.out.println(userService.getFullName("Lelde", "Brosova"));
        SpringApplication.run(DatoriumApiApplication.class, args);
    }
}

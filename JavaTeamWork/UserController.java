package com.datorium.Datorium.API.Controllers;
import com.datorium.Datorium.API.DTOs.User;
import org.springframework.web.bind.annotation.*;
import com.datorium.Datorium.API.Services.UserService;
import java.util.List; // <-- Add this import statement
@RequestMapping("/user")
@RestController

public class UserController {

    private UserService userService;

    public UserController() {
        userService = new UserService();
    }
@PostMapping("/addUser")
    public int add(@RequestBody User user) {
        return userService.add(user);
    }
@GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}


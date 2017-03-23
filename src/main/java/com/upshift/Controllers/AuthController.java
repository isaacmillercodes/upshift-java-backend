package com.upshift.Controllers;

import com.upshift.Repositories.AuthRepository;
import com.upshift.Models.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final AuthRepository repository;
    private BCryptPasswordEncoder encoder;

    public AuthController(AuthRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/register")
    public User newUser(@RequestBody User user) {
//        user.setPassword(encoder.encode(user.getPassword()));
        return this.repository.save(user);
    }
}
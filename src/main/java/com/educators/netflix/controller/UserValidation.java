package com.educators.netflix.controller;

import com.educators.netflix.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserValidation {

    @PostMapping
    public User createUser(@RequestBody User user) {

        return user;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {

        return new User();  // return user based on id
    }

    @GetMapping
    public List<User> getAllUsers() {

        return List.of(new User());  // return list of users
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {

        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {

    }
}

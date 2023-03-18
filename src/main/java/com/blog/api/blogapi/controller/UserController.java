package com.blog.api.blogapi.controller;

import com.blog.api.blogapi.model.User;
import com.blog.api.blogapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    String test() {
        return "User controller";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return this.userService.getUserByid(id);
    }
}

package com.anu.library_management_system.controller;

import com.anu.library_management_system.dao.Book;
import com.anu.library_management_system.dao.User;
import com.anu.library_management_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {

        return userService.save(user);
    }
    @GetMapping
    public List<User> getAllUsers() {

        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.findById(id);
    }



}
package com.comment.controller;

import com.comment.entities.User;
import com.comment.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService service;

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable("id") Integer id) {
        return service.getById(id);
    }
}
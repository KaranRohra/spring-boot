package com.codesnippet.tutorial.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.tutorial.entity.Employee;
import com.codesnippet.tutorial.entity.User;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("users")
// @Scope("prototype")
public class UserController {
    private final User user;
    private final Employee employee;

    public UserController(User user, Employee employee) {
        this.user = user;
        this.employee = employee;
        System.out.println("********************");
        System.out.println("UserController constructor called.");
        System.out.println("********************");
    }

    @PostConstruct
    public void init() {
        System.out.println("********************");
        System.out.println("UserController hashCode: " + this.hashCode());
        System.out.println("User hashCode: " + user.hashCode());
        System.out.println("Employee hashCode: " + employee.hashCode());
        System.out.println("********************");
    }

    @GetMapping()
    public ResponseEntity<String> getUserDetails() {
        return ResponseEntity.ok("body");
    }

}

package com.codesnippet.tutorial.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codesnippet.tutorial.entity.User;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("employees")
// @Scope("prototype")
@Scope(value = "session") // Use multiple browsers to test session scope or /employees/logout
public class EmployeeController {
    User user;

    public EmployeeController(User user) {
        this.user = user;
        System.out.println("********************");
        System.out.println("EmployeeController constructor called.");
        System.out.println("********************");
    }

    @PostConstruct
    public void init() {
        System.out.println("********************");
        System.out.println("EmployeeController hashCode: " + this.hashCode());
        System.out.println("User hashCode: " + user.hashCode());
        System.out.println("********************");
    }

    @GetMapping
    public ResponseEntity<String> getEmployeeDetails() {
        return ResponseEntity.ok("Employee");
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate(); // Invalidate the session
        return "Logged out successfully!";
    }
}

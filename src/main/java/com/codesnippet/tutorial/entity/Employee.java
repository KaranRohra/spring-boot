package com.codesnippet.tutorial.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
// @Scope("prototype")
public class Employee {
    @Autowired
    private User user;

    public Employee() {
        System.out.println("********************");
        System.out.println("Employee constructor called.");
        System.out.println("********************");
    }

    @PostConstruct
    public void init() {
        System.out.println("********************");
        System.out.println("Employee hashCode: " + this.hashCode());
        System.out.println("User hashCode: " + user.hashCode());
        System.out.println("********************");
    }
}

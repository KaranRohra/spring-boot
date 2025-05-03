package com.codesnippet.tutorial.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
// @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class User {
    public User() {
        System.out.println("********************");
        System.out.println("User constructor called.");
        System.out.println("********************");
    }

    @PostConstruct
    public void calledAfterBeanCreated() {
        System.out.println("********************");
        System.out.println("User hashCode: " + this.hashCode());
        System.out.println("********************");
    }
}

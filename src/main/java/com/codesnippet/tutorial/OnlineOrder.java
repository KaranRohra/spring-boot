package com.codesnippet.tutorial;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OnlineOrder implements Order {
    private User user;

    @Lazy
    public OnlineOrder(User user) {
        this.user = user;
    }
    public void processOrder() {
        System.out.println("Processing online order...");
    }
    public void setUser(User user) {
        this.user = user;
    }
}

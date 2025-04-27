package com.codesnippet.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.Getter;

@Component
// @Data
@Getter
public class User {
    @Autowired
    @Qualifier("onlineOrder")
    private Order fieldOrder;

    private Order setterOrder;

    private final Order constructOrder;

    private final OnlineOrder circularOrder;

    @Autowired // Autowired is optional if there is only one constructor
    public User(@Qualifier("onlineOrder") Order order, @Qualifier("onlineOrder") OnlineOrder circularOrder) {
        this.constructOrder = order;
        this.circularOrder = circularOrder;
    }

    @Autowired // Setter injection
    @Qualifier("onlineOrder")
    public void setSetterOrder(Order order) {
        this.setterOrder = order;
    }

    @PostConstruct
    public void init() {
        this.circularOrder.setUser(this);
    }
}

package com.codesnippet.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    public PaymentController() {
        System.out.println("PaymentController constructor called.");
    }

    @GetMapping("/payment")
    public String processPayment() {
        return "Payment processed successfully!";
    }
}

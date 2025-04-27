package com.codesnippet.tutorial.service;

public class CreditCardService implements PaymentService {
    public CreditCardService() {
        System.out.println("CreditCardService constructor called.");
    }
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Credit Card.");
    }
}

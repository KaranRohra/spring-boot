package com.codesnippet.tutorial.service;

public class GpayService implements PaymentService {
    public GpayService() {
        System.out.println("GpayService constructor called.");
    }
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Google Pay.");
    }
}

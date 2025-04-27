package com.codesnippet.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codesnippet.tutorial.service.CreditCardService;
import com.codesnippet.tutorial.service.GpayService;
import com.codesnippet.tutorial.service.PaymentService;

@Configuration
public class PaymentConfig {
    @Bean
    public PaymentService creditCardService() {
        return new CreditCardService();
    }

    @Bean
    public PaymentService gpayService() {
        return new GpayService();
    }
}

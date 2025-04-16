package com.codesnippet.tutorial.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codesnippet.tutorial.service.GpayPaymentService;
import com.codesnippet.tutorial.service.PaytmPaymentService;

@Configuration
public class PaymentConfiguration {
    @Bean
    GpayPaymentService gpayPaymentService() {
        return new GpayPaymentService();
    }

    @Bean
    PaytmPaymentService paytmPaymentService() {
        return new PaytmPaymentService();
    }
}

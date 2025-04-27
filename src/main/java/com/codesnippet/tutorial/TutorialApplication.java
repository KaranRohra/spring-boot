package com.codesnippet.tutorial;

import org.hibernate.annotations.Filter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import com.codesnippet.tutorial.controller.PaymentController;

@SpringBootApplication
// @ComponentScan(basePackages = {"com.codesnippet.helper",
// "com.codesnippet.tutorial"})
// @ComponentScan(basePackages = "com.codesnippet") Refer to the ScanConfig.java
// file
@ComponentScan(basePackages = "com.codesnippet.tutorial", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
		PaymentController.class }))
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}
}

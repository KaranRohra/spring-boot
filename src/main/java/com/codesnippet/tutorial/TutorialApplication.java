package com.codesnippet.tutorial;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.codesnippet.tutorial.service.IPaymentService;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TutorialApplication.class, args);
		List<String> beanNames = Arrays.asList(applicationContext.getBeanDefinitionNames());// List of all beans in the context
		IPaymentService paymentService = applicationContext.getBean("paytmPaymentService", IPaymentService.class);
	}

}

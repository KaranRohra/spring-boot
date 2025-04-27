package com.codesnippet.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TutorialApplication.class, args);
		User user = applicationContext.getBean(User.class);
		Order fieldOrder = user.getFieldOrder();
		Order setterOrder = user.getSetterOrder();
		Order constructOrder = user.getConstructOrder();
		fieldOrder.processOrder();
		setterOrder.processOrder();
		constructOrder.processOrder();
	}
}

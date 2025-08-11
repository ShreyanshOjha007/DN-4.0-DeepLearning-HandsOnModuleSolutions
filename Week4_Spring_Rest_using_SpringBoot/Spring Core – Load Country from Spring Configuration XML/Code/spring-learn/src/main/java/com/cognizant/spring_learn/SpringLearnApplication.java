package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger logger1 = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		logger1.info("Country : {}", country);
	}

	public static void main(String[] args) {

		SpringLearnApplication.displayCountry();

		SpringApplication.run(SpringLearnApplication.class, args);

	}
}

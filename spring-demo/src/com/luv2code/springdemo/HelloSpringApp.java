package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// Load Spring configuration 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// Close Context
		context.close();
	}

}
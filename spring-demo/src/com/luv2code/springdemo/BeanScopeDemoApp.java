package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//Load configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from configuration file
		
		//First retrieval
		Coach newCoach = context.getBean("myCoach", Coach.class);
		
		//Second retrieval
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//Check if the beans are the same
		boolean result = (newCoach==alphaCoach);
		
		//print out result
		System.out.println("\nPointing to the same memory: " + result);
		
		//Memory Location
		System.out.println("\nMemory location for newCoach: "+ newCoach);
		
		System.out.println("\nMemory location for alphaCoach: "+ alphaCoach + "\n");
		
		//close context
		context.close();

	}

}

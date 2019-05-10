package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleDemoApp {
	
	public static void main(String[] args) {
		// Load Configuration
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		//Retrieve bean from container
		
		TrackCoach theCoach = context.getBean("myCoach", TrackCoach.class);
		
		//Call method on bean
		System.out.println("\n"+theCoach.getDailyWorkout());
		
		System.out.println("\n"+theCoach.getDailyFortune());
		

		
		//close context
		context.close();
	}

}

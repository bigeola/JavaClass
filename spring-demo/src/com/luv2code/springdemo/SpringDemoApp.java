package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {
	
	public static void main(String[] args) {
		// Load Configuration
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Retrieve bean from container
		
		SoccerCoach theCoach = context.getBean("mySoccerCoach", SoccerCoach.class);
		
		//Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// Call new method on beans
		
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		
		//close context
		context.close();
	}

}

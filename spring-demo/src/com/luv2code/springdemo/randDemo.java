package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class randDemo {

	public static void main(String[] args) {
		
		//Loading IOC container
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from container
		BasketballCoach coach = ctx.getBean("ballCoach", BasketballCoach.class);
		
		//Call method on bean
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
		//Close Context
		ctx.close();
		

	}

}

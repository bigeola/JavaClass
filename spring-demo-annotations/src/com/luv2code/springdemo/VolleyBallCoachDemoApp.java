package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VolleyBallCoachDemoApp {

	public static void main(String[] args) {

		//Load configuration
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve Bean
		VolleyballCoach coach = 
				context.getBean("volleyBallCoach", VolleyballCoach.class);
		
		//Call methods on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//Close Context
		context.close();
	}

}

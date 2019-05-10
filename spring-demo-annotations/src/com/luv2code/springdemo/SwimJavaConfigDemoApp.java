package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// configure container
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call methods on bean
		System.out.println("\n"+theCoach.getDailyWorkout());
		
		//call method of getDailyFortune
		System.out.println(theCoach.getDailyFortune()+"\n");
		
		// call methods on property values: email and team
		System.out.println("Email: "+theCoach.getEmail()+"\n");
		System.out.println("Team: "+theCoach.getTeam());
		
		//close context
		context.close();

	}

}

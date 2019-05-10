package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// configure container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call methods on bean
		System.out.println("\n"+theCoach.getDailyWorkout());
		
		//call method of getDailyFortune
		System.out.println(theCoach.getDailyFortune()+"\n");
		
		//close context
		context.close();

	}

}

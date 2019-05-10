package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeAnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// get the bean from spring container
				Coach pCoach = context.getBean("pingPongCoach2", Coach.class);
				
				// call a method on the bean
				System.out.println(pCoach.getDailyWorkout());

				// call a method on the bean
				System.out.println(pCoach.getDailyFortune());

				// close the context
				context.close();
	}

}

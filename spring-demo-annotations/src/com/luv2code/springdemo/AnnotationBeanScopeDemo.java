package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		// Load config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		Boolean result = (theCoach == alphaCoach);
		
		//Print out results
		System.out.println("\nPointing to the same object "+result);
		
		System.out.println("\nMemory location of theCoach is: "+ theCoach);
		
		System.out.println("\nMemory location of alphaCoach is: "+ alphaCoach);
		
		// Close context
		context.close();

	}

}

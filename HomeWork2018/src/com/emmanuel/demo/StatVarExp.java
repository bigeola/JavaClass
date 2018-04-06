package com.emmanuel.demo;
// This code was written by Emmanuel Olaleye
// to Reinforce what was thought in class with regards to different variables in java
// This is a code illustrating what happens when a Static/Class variable is changed.
public class StatVarExp {
	
	// Declaring a static variable called staticVariable.
	public static String staticVariable= "This is always the same pending change";
	
	// Creating a a method called main that returns no value, but prints out the 
	// value of the static variable.
	public static void main(String [] args) {
		StatVarExp obj = new StatVarExp();
		StatVarExp obj2 = new StatVarExp();
		StatVarExp obj3 = new StatVarExp();
		
		// printing out values
		System.out.println(obj.staticVariable);
		System.out.println(obj2.staticVariable);
		System.out.println(obj3.staticVariable);
		
		// changing the value of one of the variables.
		obj3.staticVariable = "Now the value has been changed";
		
		// Displaying the new value for staticVariable
		System.out.println("\n");
		System.out.println(obj.staticVariable);
		System.out.println(obj2.staticVariable);
		System.out.println(obj3.staticVariable);
		
		
		
		
	}

}

package com.emmanuel.demo;
// This code provides an example of instance variable
public class InstVar {
	// Declaring a variable called number
	int number = 10;
	
	// creating a method that prints out just number without returning a value
	public static void main(String[] args) {
		InstVar obj = new InstVar();
		InstVar obj2 = new InstVar();
		InstVar obj3 = new InstVar();
		
		// Printing out the values of the number variable
		System.out.println(obj.number);
		System.out.println(obj2.number);
		System.out.println(obj3.number);
		
		// changing the value of obj.number
		obj.number = 1300;
		
		// Printing out the values of the number variable
		System.out.println("\n");
		System.out.println(obj.number);
		System.out.println(obj2.number);
		System.out.println(obj3.number);
		
		
		
		
	}

}

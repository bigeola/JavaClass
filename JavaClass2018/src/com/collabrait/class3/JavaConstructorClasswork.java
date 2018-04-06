package com.collabrait.class3;

public class JavaConstructorClasswork {
	/*
	 * Two Classes
	 * Only one should have main method
	 * Class define variable for person 
	 * Use other class to call the variables from person person
	 * Print names address and phone numbers
	 * You should be able to print at least three diff persons names
	 */

	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		p1.name = "Emmanuel";
		p1.address = "119 Rowell Court";
		p1.number = "443-133- 1834";
		
		System.out.println("My name is " + p1.name + ". My address is "+ p1.address
		+ ". My phone number is " + p1.number);
		
		p2.name = "Daniel";
		p2.address = "117 Rowell Court";
		p2.number = "332-123-8766";
		
		System.out.println("My name is " + p2.name + ". My address is "+ p2.address
				+ ". My phone number is " + p2.number);
		
		p3.name = "Milan";
		p3.address = "113 Rowell Court";
		p3.number = "998-009-8876";
		
		
		System.out.println("My name is " + p3.name + ". My address is "+ p3.address
				+ ". My phone number is " + p3.number);
		
		
		
	}
}

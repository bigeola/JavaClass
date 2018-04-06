package com.collabrait.class2;

public class EnhancedForLoop {
	public static void main(String [] args) {
		/* enhanced for loop is usually used in Array: Lis tany kind of collections;
		 *  int arr [] = {1,2,3,4};
		 *  	for(initialization : variable)
		 *  	System.out.println(variable)*/
		
		
		
		int arr[] = {1, 11, 45, 9};
		for(int num: arr) {
			System.out.println(num);
		}
		
		String arr2[] = {"Hey", "My name is ", "Mike"};
		for(String str : arr2) {
			System.out.println(str);
		}
		
		
		// Initializing 3 arrays of different datatypes
		char cha[] = {'A', 'B', 'C'};
		double dob[] = {1.11, 2.22, 3.33, 4.44};
		float FloatNum[] = {3.33F, 4.4445F, 6.7778F};
		
		System.out.println("\nCha Data type");
		for(char letter : cha) {
			System.out.println(letter);
		}
		
		System.out.println("\nDouble Data type");
		for(double two : dob) {
			System.out.println(two);
			
			
		}
		
		System.out.println("\nFloat Data type");
		for(float floater : FloatNum) {
			System.out.println(floater);
		}
		
	}

}

package com.emmanuel.demo;

// This program was written by Emmanuel Olaleye
// The purpose of this program is to print out a sentence containing different data types.
// It incorporates all primitive data types and a non-primitive data type.

public class MixDataTypes {
	public static void main(String [] args) {
		// Declaring variables of different data types
		
		int intNumber = 5; // assigning an integer value to the variable intNumber
		
		boolean boolNum = false; // assigning a ;false' value to the variable boolNum
		
		byte byteNum = -110; // assigning a value to the byteNum variable
		
		char character = 'M'; // assigning a value to the character variable
		
		short shortNum = 30; // assigning a value to the shortNum variable
		
		long longNum = -2L; // assigning a value to the longNum variable
		
		float floatNum = 3.5557F; // assigning a value to the FloatNum variable
		
		double pi = 3.14; // assigning a value to the pi variable
		String word = "I will form a sentence using various data types.";
		
		// Printing out all the variables declared earlier
		
		System.out.println(word + "\n");
		System.out.println("intNumber = " + intNumber + "\n");
		System.out.println("boolNum = " + boolNum + "\n");
		System.out.println("byteNum = " + byteNum + "\n");
		System.out.println("character = " + character + "\n");
		System.out.println("shortNum = " + shortNum + "\n");
		System.out.println("longNum = " + longNum + "\n");
		System.out.println("floatNum = " + floatNum + "\n");
		System.out.println("pi = " + pi + "\n");
		
		// Forming a sentence with 
		System.out.println(word + " An integer and a double can be added together.\n"
				+ "In our case the answer = " + intNumber + pi + ".\n" +
				"Also, long, short, float data types can be manipulated using "
				+ "mathematical statements" + (byteNum+shortNum)/(longNum+floatNum) + ".\n"
				+ "It is " + boolNum  + " that the character " + character + " can be subtracted "
						+ "from " + " " + pi);
		
	}
}

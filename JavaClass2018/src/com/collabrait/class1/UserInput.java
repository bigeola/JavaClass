package com.collabrait.class1;

import java.util.Scanner;

public class UserInput {
	public static void main(String [] args) {
		// Declaring variable without assigning a value
		int num1;
		int num2;
		int sum;
		
		// declaring a pseudonym for the scanner class which accepts user input of integer datatype.
		Scanner sc = new Scanner(System.in);
		
		// Asking the user for input
		System.out.println("Enter First Number: ");
		num1 = sc.nextInt();
		
		// Asking the user for a second input.
		System.out.println("Enter Second Number: ");
		num2 = sc.nextInt();
		
		// Asking the program to stop accepting inputs
		sc.close();
		
		sum = num1 + num2;
		
		System.out.println("Output: " + sum);
		
	}

}

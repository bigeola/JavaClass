package com.homework.day2;

import java.util.Scanner;

public class ScannerOutput {
	public static void main(String [] args) {
		
		// Declaring variables
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		// Asking for inputs and specifying a value
		System.out.println("Enter First Number");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2 = sc.nextInt();
		
		sc.close();
		
		int num3 = num1*num2;
		
		System.out.println("Output: " + num3);
	}

}

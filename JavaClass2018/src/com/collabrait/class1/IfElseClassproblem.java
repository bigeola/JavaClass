package com.collabrait.class1;

import java.util.Scanner;

public class IfElseClassproblem {
	
	public static void main(String [] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a value: ");
		num = sc.nextInt();
		sc.close();
		
		if(num < 0) {
			System.out.println("This is a negative number");
		}
		else if (num > 0) {
			System.out.println("It is a positive number");
		}
		else {
			System.out.println("It is neither positive nor negative");
		}
	}

}

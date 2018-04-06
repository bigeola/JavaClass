package com.collabrait.class1;

public class IfElseExpression {
	public static void main(String [] args) {
		// There are 4 types of If statements
		// if statement
		//		if(condition){
		//			statement
		//		}
		
		
		
		int num = 70;
		if(num > 10) {
			System.out.println("The number 10 is lesser than the initial number entered which is" + num);
			if(num <75) {
				System.out.println("The number is less than 75");
			}

		}
		
		if (num < 80) {
			System.out.println("This is if");
		}else {
			System.out.println("This is else");
		}
		
		
		
		
		
		
		// If else statement
		int num1 = 10;
		int num2 = 50;
		
		System.out.println("\n");
		if(num1  == num2) {
			System.out.println("num1 and num2 are not equal");
		} else {
			System.out.println("num1 and num2 are not equal");
		}
		
		// If num2 == num1
		if(num1  != num2) {
			System.out.println("num1 and num2 are not equal");
		} else {
			System.out.println("num1 and num2 are equal");
		}
		
		// If num1 > num2
		if(num1  > num2) {
			System.out.println("num1 is greater than num2");
		} else {
			System.out.println("num1 is not greater than num2");
		}
		
		// if num2 < num1
		if(num1  < num2) {
			System.out.println("num1 is less than num2");
		} else {
			System.out.println("num1 is greater than num2");
		}
		
		if(num1  >= num2) {
			System.out.println("num1 is greater than num2");
		} else {
			System.out.println("num1 is less than num2");
		}
		
		if(num1  <= num2) {
			System.out.println("num1 is less than or equal to num2");
		} else {
			System.out.println("num1 is not greater than num2");
		}
	}
	

}

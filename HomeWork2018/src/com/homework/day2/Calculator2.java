package com.homework.day2;

import java.util.Scanner;

public class Calculator2 {
	

	
	public static int Addition(int number1, int number2) {
		
		return number1 + number2;
	}
	
	public static int Subtraction(int i, int j) {
		return i - j;
	}
	
	public static int Multiplication (int i, int j) {
		return i * j;
	}
	
	public static int Division (int k, int m) {
		return k / m;
	}
	
	public static void main(String [] args) {
		
		int num1;
		int num2;
		char oper;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter an integer: ");
		num2 = scan.nextInt();
		
		System.out.println("Enter one of the following arithmetic operator +, - , *, or /: ");
		oper = scan.next().charAt(0);
		
		scan.close();
		
		switch(oper) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + Addition(num1,num2));
			break;
			
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + Subtraction(num1,num2));
			break;
			
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + Multiplication(num1,num2));
			break;
			
		case '/':
			System.out.println(num1 + " - " + num2 + " = " + Division(num1,num2));
			break;
			
			default:
				System.out.println("Enter a valid arithmetic operator. Learn how to follow simple instructions!!!!");
			
		}
	}

}

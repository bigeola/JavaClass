package com.homework.day2;

import java.util.Scanner;
public class Calculator {
	public static void main(String [] args) {
		int num1;
		int num2;
		char oper;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an integer: ");
		num1 = scan.nextInt();
		
		System.out.println("Input an integer: ");
		num2 = scan.nextInt();
		
		System.out.println("Input an arithmetic operation: ");
		oper = scan.next().charAt(0);
		
		scan.close();
		
		System.out.println(num1  );
	}
}

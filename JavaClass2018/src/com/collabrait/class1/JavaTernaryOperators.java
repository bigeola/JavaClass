package com.collabrait.class1;

import java.util.Scanner;

public class JavaTernaryOperators {
	public static void main(String[] args) {
		// variable num1 = (expression) ? value if true : value if false

		int num1;
		int num2;
		int a;
		int b;
		int c;
		int lNumber1;
		int lNumber2;
		num1 = 10;
		num2 = (num1 != 10) ? 100 : 200;
		System.out.println(num2);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number:");
		a = sc.nextInt();

		System.out.println("Enter Second Number:");
		b = sc.nextInt();

		System.out.println("Enter Third Number:");
		c = sc.nextInt();

		sc.close();

		lNumber1 = (a >= b) ? a : b;
		lNumber2 = (lNumber1 >= c) ? lNumber1 : c;
		System.out.println("Largest number is : " + lNumber2);

	}

}

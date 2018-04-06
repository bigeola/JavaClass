package com.collabrait.class1;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int mod;

		System.out.println("Enter any number ");
		num = sc.nextInt();
		sc.close();

		mod = num % 2;

		switch (mod) {
		case 0:
			System.out.println("The number " + num + " is even");
			break;
		default:
			System.out.println("The number " + num + " is odd");
		}

	}

}

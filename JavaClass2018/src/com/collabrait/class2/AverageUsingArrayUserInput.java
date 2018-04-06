package com.collabrait.class2;

import java.util.Scanner;

public class AverageUsingArrayUserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of your array: ");
		int size = input.nextInt();
		
		
		double arr[] = new double[size];
		
		double total  = 0;
		int i;
		for(i = 0; i < size; i++) {
			System.out.println("Enter a value for index " + i);
			arr[i] = sc.nextDouble();
			total = total + arr[i];
		}
		sc.close();
		
		System.out.println("Total = " + total );
		double average = total/arr.length;
		System.out.println("\nAverage = " + average);
	}

}

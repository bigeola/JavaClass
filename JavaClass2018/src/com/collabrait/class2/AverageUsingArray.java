package com.collabrait.class2;

import java.util.Scanner;

public class AverageUsingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double arr[] = {12, 34.89, 16.5, 200};
		double total = 0;
		int i = 0;
		
		for(i = 0; i<arr.length; i++) {
			total = total + arr[i];
		}
		
		System.out.println("Total = " + total);
		
		double average = total/arr.length;
		System.out.println("\nAverage = " + average);
		
		
	}
	

}

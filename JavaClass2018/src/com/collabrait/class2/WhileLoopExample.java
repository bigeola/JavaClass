package com.collabrait.class2;

public class WhileLoopExample {
	public static void main(String [] args) {
		double num = 3.14;
		while(num > 3 && num<10) {
			System.out.println(num);
			num++;
		}
		
		System.out.println("\nArrays");
		double arr[] = {1.21, 2.32, 3.43, 4.54, 6.76};
		int i = 0;
		while(i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
	}

}

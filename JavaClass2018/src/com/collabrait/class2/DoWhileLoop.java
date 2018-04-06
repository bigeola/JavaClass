package com.collabrait.class2;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println(i);
			i--;
		}while(i>0);
		
		System.out.println("\nArray");
		
		int arr[] = {1, 3, 67, 89, 90};
		int num = 0;
		
		do {
			System.out.println(arr[num]);
			num++;
		}while(num < arr.length);
	}

}

package com.collabrait.class2;

public class JavaForLoop {
	public static void main(String[] args) {
//		for (int i = 10; i > 0; i--) {
//			int mod = i % 2;
//			switch (mod) {
//			case 0:
//				System.out.println(i + " is an even number!");
//				break;
//			default:
//				System.out.println(i + " is an odd number!");
//			}
//
//		}
		
		
//		for (int j = 0; j < 10; j++) {
//			System.out.println(j);
//			j++;
//		}
		
		// initializing an array
		int arr[] = {2,4,6,8,10};
		String names [] = {"John", "Mike", "smith"};
		
		System.out.println("Number Array");
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			}
		
		System.out.println("\n");
		
		System.out.println("Name Array");
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
			}
		
	}

}

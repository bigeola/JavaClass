package com.collabrait.day7;

public class OneTryCatchBlockExample {

	public static void main(String[] Args) {
		singleTryCatch();
		 multipleTryCatch();
	}

	public static void singleTryCatch() {
		int num1;
		int num2;

		try {
			num1 = 0;
			num2 = 50 / num1;
			System.out.println(num2);
			System.out.println("This is the try block");
		} catch (ArithmeticException e) {
			System.out.println("Please do not divide numbers with zero");
		}
		System.out.println("This is the end of single try-catch block");
	}
	
	public static void multipleTryCatch() {
		try {
			int [] arr = {3, 5, 78, 98, 78};
			for(int i = 0; i<6; i++) {
				System.out.println(arr[i]);
				int num3 = 60/0;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array index out of bound error");
			
		} catch(ArithmeticException e2) {
			System.out.println("Arithmetic exception");
			
		} catch (Exception e3) {
			System.out.println("an exception");
			
		}
		
		System.out.println("This is the end of multiple try-catch block");
		
	}

}

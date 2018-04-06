package com.collabrait.day7;

public class ExamplesOfExceptions {
	public static void main(String[] args){
		arithmeticExceptions(45,0);
		arrayIndexOutOfBounds(36);
		numberFormat("XYC");
		stringIndexOutOfBound(45);
		nullPointer(null);
		
	}
	
	public static void arithmeticExceptions(int num1, int num2) {
		try {
			int number = num1/num2;
			System.out.println("This is the try block");
			System.out.println(number);
		}
		catch(ArithmeticException e1) {
			System.out.println("Dividing by zero is unacceptable");
		}
		
		
	}
	
	public static void arrayIndexOutOfBounds(int num3) {
		
		try {
			System.out.println("\nThis is try using the arrayIndexOutOfBounds ");
			int arr[] = {1, 2, 3, 4, 6, 7, 8, 9};
			for(int i = 0; i< num3; i++) {
				System.out.println(arr[1]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("Array is out of bounds");
		}
		
	}
	
	public static void numberFormat(String str) {
		
		try {
			System.out.println("\nThis is try using the numberFormat method ");
			int number = Integer.parseInt(str);
			System.out.println(number);
		}catch (NumberFormatException e3){
			System.out.println("This String cannot be converted to numbers");
		}
		
	}
	
	public static void stringIndexOutOfBound(int num4) {
		
		try {
			System.out.println("\nThis is try using the stringIndexOutOfBound method ");
			String str1 = "JavaforBeginners";
			System.out.println("String length is " + str1.length());
		}catch (StringIndexOutOfBoundsException e3){
			System.out.println("String Index is out of bounds.");
		}
	}
	
	public static void nullPointer(String str3) {
		try {
			
			String str2 = str3;
			System.out.println(str2.length());
			
		}catch (NullPointerException e) {
			System.out.println("String gets null pointer");
		}
		
	}

}

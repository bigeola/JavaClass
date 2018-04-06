package com.collabrait.class4;

public class MethodWithParam {
	public static void main(String[] args) {
		int result;
		int n;
		
		n = 3;
		result = square(n);
		System.out.println("Value of N square is " + result);
		
		
		n = 4;
		result = square(n);
		System.out.println("Value of N square is " + result);
		
	}
	
	public static int square(int i) {
		return i*i;
	}

}

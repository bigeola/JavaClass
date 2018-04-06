package com.collabrait.class4;

public class ArithmeticMain {
	public static void main(String[] args) {
		
		System.out.println("10 + 20 = " + getIntegerSum(10,20));
		System.out.println("20 * 40 = " + multiplyInteger(20,40));
	}
	
	public static int getIntegerSum(int a, int b) {
		return a+b;	
	}
	
	public static int multiplyInteger(int a, int b) {
		return a*b;
		
	}

}

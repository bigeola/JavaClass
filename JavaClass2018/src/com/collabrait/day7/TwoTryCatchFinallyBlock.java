package com.collabrait.day7;

public class TwoTryCatchFinallyBlock {
	
	public static void main(String[] args) {
		finallyTry();
	}
	
	public static void finallyTry() {
		try {
			int num = 123/11;
			System.out.println(num);
		}
		catch (ArithmeticException e) {
			System.out.println("Number should not be divided by zero");
		}
		finally {
			System.out.println("This is finally block");
		}
		
		System.out.println("This is outside of try-catch");
	}

}

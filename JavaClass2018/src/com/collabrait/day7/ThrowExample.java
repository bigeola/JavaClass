package com.collabrait.day7;

public class ThrowExample {
	// student age >12
	// weight > 40
	
	
	public static void main(String[] args) {
		checkEligibility(10,39);
	}
	
	static void checkEligibility(int stuage, int stuweight) {
		if (stuage < 12 && stuweight < 40) {
			throw new ArithmeticException("Student not eligible");
		}
		else {
			System.out.println("Student is Eligible");
		}
	}

}

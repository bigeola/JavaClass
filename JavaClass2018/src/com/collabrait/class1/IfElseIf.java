package com.collabrait.class1;

public class IfElseIf {
	public static void main(String [] args) {
		int num =1234;
		if(num < 100 && num >=1) {
			System.out.println("It's a two digit");
		}
		else if (num <1000 && num >= 100) {
			System.out.println("It's a four digit");
		}
		else if (num < 10000 && num >= 1000) {
			System.out.println("It's a five digit");
		}
		else {
			System.out.println("Number is out of range");
		}
		
		int num1 = 100;
		int num2 = 20;
		int num3 = 70;
		
		if((num1 >= num2) && (num1 >= num3)) {
			System.out.println("The largest number is num1 = " + num1);
		}
		else if ((num2 >= num1) && (num2 >= num3)) {
			System.out.println("The largest number is num2 = " + num2);
		}
		else {
			System.out.println("The largest numbe is num3 = " + num3);
		}
	}

}

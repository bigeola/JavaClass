package com.collabrait.class1;

public class Operators_Expressions {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		String output = "Output; ";
		
		num2=num1;
		System.out.println("= " + output + num2);
		
		num2+=num1;
		System.out.println("+= " + output + num2);
		
		num2-=num1;
		System.out.println("-= " + output + num2);
		
		num2*=num1;
		System.out.println("*= " + output + num2);
		
		num2/=num1;
		System.out.println("/= " + output + num2);
		
		num2%=num1;
		System.out.println("%= " + output + num2);
		
	}
}

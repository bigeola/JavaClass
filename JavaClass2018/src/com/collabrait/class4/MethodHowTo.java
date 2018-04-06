package com.collabrait.class4;

public class MethodHowTo {
	public static void main(String [] args){
		myMethod();
		myInt();
		System.out.println(square());
	}
	
	private static void myMethod() {
		System.out.println("Printing my method");
	}
	
	public static void myInt() {
		int a =10;
		int b = 5;
		
		System.out.println(a*b);
	}
	
	public static int square() {
		int l = 5;
		int area = l*l;
		return area;
		
	}

}

package com.collabrait.class2;

public class ForLoopExample {
	public static void main(String [] args) {
		int num;
		for (num = 10; num > 0; num--) {
			System.out.println(num);
		}
		
		System.out.println("\nThis is an even num\n");
		for (num = 10; num >= 0; num--) {
			System.out.println("This is an even num " + num);
			num--;
		}
	}

}

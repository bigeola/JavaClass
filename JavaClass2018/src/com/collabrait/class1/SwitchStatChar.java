package com.collabrait.class1;


public class SwitchStatChar {
	public static void main(String [] args) {
		char grade = 'D';
		
		
		
		
		switch (grade){
		case 'A':
			System.out.println("You hand an " + grade + " Excellent!");
			break;
			
		case 'B':
			System.out.println("You got a " + grade + " Good job!");
			break;
			
		case 'C':
			System.out.println("You got a " + grade + " You Passed!");
			break;
			
		default:
			System.out.println("You got a " + grade + "!!! You failed! You need to think about your life lol");
			
			
			
		}
	}

}

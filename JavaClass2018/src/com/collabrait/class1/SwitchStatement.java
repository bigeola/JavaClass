package com.collabrait.class1;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {

		String day;

		Scanner scan = new Scanner(System.in);

		System.out.println("What Day of the Week is it? ");
		day = scan.next();

		scan.close();

		switch (day) {

		case "Monday":
			System.out.println("Today is Monday");
			break;

		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;

		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;

		case "Thursday":
			System.out.println("Today is Thursday");
			break;

		case "Friday":
			System.out.println("Today is Friday \n" + "The weekend  begins today");
			
			break;

		default:
			System.out.println("It is the end of the week");
		}

	}

}

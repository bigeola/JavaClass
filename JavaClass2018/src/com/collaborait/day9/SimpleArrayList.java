package com.collaborait.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleArrayList {

	// Syntax for declaring an array list
	// The static key word is used because it is a global variable.
	// In order to make it accessible to another method.

	static ArrayList<String> arrList = new ArrayList<>();

	public static void main(String[] args) {
		ArrayListExample();

	}

	public static void ArrayListExample() {
		arrList.add("MIKE");
		arrList.add("Meg");
		arrList.add("Victor");
		arrList.add("Jack");
		arrList.add("Milan");
		arrList.add("Raja");
		System.out.println(arrList);

		// Using a Scanner to populate an array.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name.");
		arrList.add(sc.nextLine());
		System.out.println(arrList);

		// Size of an Array
		System.out.println("Array Size");
		System.out.println(arrList.size());

		// Deleting a name using the index.
		System.out.println("\nRemoving a name using the Index");
		arrList.remove(2);
		System.out.println(arrList);

		// Size of an Array
		System.out.println("Array Size");
		System.out.println(arrList.size());

		// Deleting a name using the name.
		System.out.println("\nRemoving a name using the value");
		arrList.remove("Meg");
		System.out.println(arrList);

		// Size of an Array
		System.out.println("Array Size");
		System.out.println(arrList.size());

		// Adding a value to a specific index.
		System.out.println("\nEnter another name:");
		arrList.add(2, sc.nextLine());

		// Size of an Array
		System.out.println("Array Size");
		System.out.println(arrList.size());

		arrList.set(0, "Josh");
		System.out.println(arrList);

		// Size of an Array
		System.out.println("Array Size");
		System.out.println(arrList.size());

		sc.close();

	}

}

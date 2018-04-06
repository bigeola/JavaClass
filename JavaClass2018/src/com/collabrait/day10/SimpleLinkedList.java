package com.collabrait.day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class SimpleLinkedList {
	
	public static void main(String[] args) {
		linkedList();
	}
	
	public static void linkedList() {
		LinkedList<String> link = new LinkedList<>();
		
		link.add("DC");
		link.add("New york");
		link.add("Boston");
		link.add("Baltimore");
		
		System.out.println("Full City List: " + link);
		
		link.addFirst("Chicago");
		link.addLast("Houston");
		
		System.out.println("After adding city: " + link);
		
		
		// getting the value from a list using index
		Object firstVar = link.get(0);
		Object thirdVar = link.get(3);
		System.out.println(firstVar + " " + thirdVar );
		
		link.set(0,"SFO");
		link.set(3, "Kansas");
		
		System.out.println("After Set: " + link);
		
		
		// Creating and initializing an array list
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("Phoenix");
		arr.add("San Antonio");
		arr.add("Dallas");
		
		// Appending the Array List to the the linked list.
		link.addAll(arr);
		
		System.out.println("After Adding ArrayList: " + link);
		
		// Looking for the index of a certain value
		System.out.println("Index of New York city" + link.indexOf("New York"));
		
		//Deleting all fields in the linked list
		link.clear();
		System.out.println("Clear all List: " + link);
		
		
	}

}

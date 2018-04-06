package com.collaborait.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayWithLoops {
	
	static ArrayList<String> arr2 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		arrayMethod();
	}
	
	public static void arrayMethod() {
		
		arr2.add("Virginia");
		arr2.add("Maryland");
		arr2.add("Pennsylvania");
		arr2.add("Delaware");
		arr2.add("New Jersey");
		arr2.add("New York");
		arr2.add("Washington DC");
		
		int i;
		System.out.println("Printing the array values with a simple for loop");
		for(i =0; i<arr2.size(); i++) {
			System.out.println(arr2.get(i));
		}
		
		System.out.println("\nPrinting the array values with a while loop");
		int j = 0;
		while(j < arr2.size()) {
			System.out.println(arr2.get(j));
			j++;
		}
		
		System.out.println("\nPrinting the array values with an enhanced for loop");
		for(String str: arr2 ) {
			System.out.println(str);
		}
		
		System.out.println("\nIterator");
		Iterator in = arr2.iterator();
		
		while(in.hasNext()) {
			System.out.print("Iterator" + in.next());
		}
		
		System.out.println("Enumeration");
		Enumeration<String> e = Collections.enumeration(arr2);
		while (e.hasMoreElements()) {
			System.out.println("With Enumeration: "  + e.nextElement());
		}
	}

}

package com.collabrait.day10;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import com.collaborait.day9.Student;

public class VectorExample {
	
	public static void main(String[] args) {
		vectorDemo();
		vecPojo();
	}
	
	public static void vectorDemo() {
		
		Scanner sc1 = new Scanner(System.in);
		
		Vector<Integer> vec = new Vector<>();
		
		System.out.println("How many Vector fields will you like to input:");
		int size = sc1.nextInt();
		
		for(int num=0; num < size; num++) {
			System.out.println("Enter an inter value: ");
			vec.addElement(sc1.nextInt());
			
		}	
		
		
		System.out.println(vec);
			Iterator i = vec.iterator();
			
			System.out.println("\nPrinting the values of the vector");
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		
	}
	
	
	public static void vecPojo() {
		System.out.println("Vector with pojo");
		Vector<Student> vec2 = new Vector<>();
		vec2.addElement(new Student("Mike", 15, 25));
		vec2.addElement(new Student("Milan", 11, 32));
		vec2.addElement(new Student("Daniel", 9, 30));
		vec2.addElement(new Student("Oscar", 2, 25));
		
		System.out.println(vec2);
	}

}

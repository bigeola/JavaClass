package ToDoList;

import java.util.Scanner;
import ToDoList.Home;
import ToDoList.Work;



public class ToDoDemo {
	
	public static void main(String[] args) {
		
		int count;
		char redo;
		
		Scanner scan = new Scanner(System.in);
		Work W = new Work();
		Home H = new Home();
		
		
		
		System.out.println("The work category in your Todo list is empty, please initialize it with three tasks you will like to perform. ");
			W.workInput();	
		
		
		
		System.out.println("\nThe home category in your Todo list is empty, please initialize it with three tasks you will like to perform. ");
			H.homeInput();	

		
		System.out.println("\nYour Current ToDo list. Work category.");
		W.workDisplay();

		System.out.println("\nYour Current ToDo list. Home category.");
		H.homeDisplay();
		
		
		
		do {
			
		
			
			
			
			System.out.println("What will you like to do? Press \n1. To add a task.\n2. To delete a specific task"
					+ "\n3. To clear all tasks.");
			
			int select = scan.nextInt();
			
			if (select == 1) {
				
				System.out.println("\nWhat category wil you like to update? \nEnter w for work category or "
						+ "\nEnter h for home category. ");
				char add = scan.next().charAt(0);
				
				if (add == 'w') {
			
					System.out.println("\nDisplaying all your current work to-do list");
					W.workDisplay();
					
					W.workInput();
					
					System.out.println("\nDisplaying all your current work to-do list");
					W.workDisplay();
						
					}else if(add == 'h') {
						
						System.out.println("\nDisplaying all your current home to-do list");
						H.homeDisplay();
						
						H.homeInput();
						
						System.out.println("\nDisplaying all your current home to-do list");
						H.homeDisplay();
				}else {
					System.out.println("Please provide a valid response");
				}
			}
			
			else if (select == 2) {
				
				System.out.println("What category wil you like to update? \nEnter w for work category or "
						+ "\nEnter h for home category. ");
				char rm = scan.next().charAt(0);
				
				if (rm == 'w') {
					
					String task;
					
					System.out.println("\nDisplaying all your current work to-do list");
					W.workDisplay();
					
					System.out.println("what task will you like to delete?");
					task = scan.next();
					
					
					W.workDelete(task);
					
					System.out.println("\nDisplaying all your current work to-do list");
					W.workDisplay();
						
					}else if(rm == 'h') {
						
						String task;
						
						System.out.println("\nDisplaying all your current home to-do list");
						H.homeDisplay();
						
						System.out.println("what task will you like to delete?");
						task = scan.next();
						
						H.homeDelete(task);
						
						System.out.println("\nDisplaying all your current home to-do list");
						H.homeDisplay();
				}else {
					System.out.println("Please provide a valid response");
				}
			}
			else if (select == 3) {
				System.out.println("What category wil you like to update? \nEnter w for work category or "
						+ "\nEnter h for home category. ");
				char add = scan.next().charAt(0);
				
				if (add == 'w') {
					
					System.out.println("\nDisplaying all your current work to-do list");
					W.workDisplay();
					
					W.workclear();
					
					System.out.println("\nDisplaying all your current work to-do list");
					W.workDisplay();
						
					}else if(add == 'h') {
						
						System.out.println("\nDisplaying all your current home to-do list");
						H.homeDisplay();
						
						H.homeclear();
						
						System.out.println("\nDisplaying all your current home to-do list");
						H.homeDisplay();
				}else {
					System.out.println("Please provide a valid response");
				}
			}
			else {
				System.out.println("You did not enter a valid response. Please input a number between 1 and 3.");
			}
			
			System.out.println("To perform another task, press y then enter key. ");
			redo = scan.next().charAt(0);
		}while(redo == 'y');
		
	}

}

package ToDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Home {
	 List<String> hc = new ArrayList<String>();
	
	public void homeInput() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("How many Tasks will you like to input into the home category?");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.println("Input a task you will like to perform at home");
			hc.add(sc.next());
			
		}
	}


	
	public void homeDelete(String j) {
		hc.remove(j);
		System.out.println("Task " + j + " has been removed from the To-do list.");
		
	}
	
	public  void homeclear() {
		hc.clear();
		System.out.println("The To-Do list has been cleared!!! There is no plan in place.");
	}
	
	public void homeDisplay() {
		System.out.println(hc);
	}

}

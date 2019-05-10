package ToDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Work {

	List<String> wc = new ArrayList<String>();

	public void workInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many Tasks will you like to input into the work category?");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("Input a task you will like to perform at work");
			wc.add(sc.next());

		}
	}

	public void workDelete(String j) {
		wc.remove(j);
		System.out.println("Task " + j + " has been removed from the To-do list.");

	}

	public void workclear() {
		wc.clear();
		System.out.println("The To-Do list has been cleared!!! There is no plan in place.");
	}

	public void workDisplay() {
		System.out.println(wc);
	}

}

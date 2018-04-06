package Set;

import java.util.TreeSet;

import com.collaborait.day9.Student;

public class TreeSet2 {

	public static void main(String[] args) {
		treeSetString();
		treeSetInt();
		treeSetStu();
	}

	public static void treeSetString() {

		TreeSet<String> tr = new TreeSet<>();

		tr.add("ABC");
		tr.add("String");
		tr.add("Test");
		tr.add("Pen");
		tr.add("Ink");
		tr.add("Jack");

		System.out.println(tr);
	}

	public static void treeSetInt() {

		TreeSet<Integer> tr2 = new TreeSet<>();

		tr2.add(1);
		tr2.add(50);
		tr2.add(44);
		tr2.add(2000);
		tr2.add(300);
		tr2.add(67);

		System.out.println(tr2);

	}

	public static void treeSetStu() {
		TreeSet<Student> tr3 = new TreeSet<>();
		
		tr3.add(new Student("Name", 12, 13));

//		tr3.add(new Student("Mike", 11, 32));
//		tr3.add(new Student("Peter", 12, 33));
//		tr3.add(new Student("Jack", 13, 34));

		System.out.println(tr3);

	}

}

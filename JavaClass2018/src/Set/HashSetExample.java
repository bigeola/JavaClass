package Set;

import java.util.HashSet;

import com.collaborait.day9.Student;

public class HashSetExample {
	public static void main(String[] args) {
		hashTable();
		hashSetwithPojo();
	}
	
	public static void hashTable() {
		HashSet<String> hset = new HashSet<>();
		hset.add("AA");
		hset.add("BB");
		hset.add("CC");
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);
	}
	
	public static void hashSetwithPojo() {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("Mike", 11, 32));
		hs.add(new Student("Peter", 12, 33));
		hs.add(new Student("Jack", 13, 34));
		
		System.out.println(hs);
		
	}

}

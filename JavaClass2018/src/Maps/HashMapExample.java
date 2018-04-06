package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		hashMapTest();
		hashMapTest2();
	}
	
	public static void hashMapTest() {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(2, "VA");
		hMap.put(34, "MA");
		hMap.put(4, "NY");
		hMap.put(78, "KY");
		hMap.put(89, "NC");
		
		System.out.println(hMap);
		
		
		System.out.println("Index of 78 is " + hMap.get(78));
		System.out.println("=====================");
		System.out.println("Size of hMap is " + hMap.size());
		System.out.println("=====================");
		System.out.println("Index of 78 is " + hMap.get(78));
		System.out.println("=====================");
		System.out.println("Is Map Empty " + hMap.isEmpty());
		System.out.println("=====================");
		System.out.println("Does Key Exist: " + hMap.containsKey(89));
		System.out.println("=====================");
		System.out.println("Does value Exist: " + hMap.containsValue("MA"));
		System.out.println("=====================");
		System.out.println("Removing Key 34: " +hMap.remove(34));
		System.out.println("=====================");
		
		// Since the map is not a list, it needs to be set into a list using 
		// the set class.
		
		Set set = hMap.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry mEntry = (Map.Entry) it.next();
			System.out.print("Key is " +mEntry.getKey() + " Value is: ");
			System.out.println(mEntry.getValue());
		}
		
	}
	
	public static void hashMapTest2() {
		HashMap<String, Double> hMap2 = new HashMap<String, Double>();
		
		System.out.println("\nNew Hash Map Example\n");
		
		hMap2.put("VA", 2.0);
		hMap2.put("MA", 33.98);
		hMap2.put("NY", 44.16);
		hMap2.put("KY", 78.21);
		hMap2.put("NC", 89.45);
		
		System.out.println(hMap2);
		
		
		System.out.println("Index of 78 is " + hMap2.get("KY"));
		System.out.println("=====================");
		System.out.println("Size of hMap is " + hMap2.size());
		System.out.println("=====================");
		System.out.println("Index of 78 is " + hMap2.get("NC"));
		System.out.println("=====================");
		System.out.println("Is Map Empty " + hMap2.isEmpty());
		System.out.println("=====================");
		System.out.println("Does Key Exist: " + hMap2.containsKey("NY"));
		System.out.println("=====================");
		System.out.println("Does value Exist: " + hMap2.containsValue(2.0));
		System.out.println("=====================");
		System.out.println("Removing Key 34: " +hMap2.remove("KY"));
		System.out.println("=====================");
		
		// Since the map is not a list, it needs to be set into a list using 
		// the set class.
		
		Set set = hMap2.entrySet();
		Iterator it2 = set.iterator();
		
		while(it2.hasNext()) {
			Map.Entry mEntry = (Map.Entry) it2.next();
			System.out.print("Key is " +mEntry.getKey() + " Value is: ");
			System.out.println(mEntry.getValue());
		}
		
	}
}
package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorting {
	
	public static void main(String[] args) {
		 hashTreeMap();
	}
	
	public static void hashTreeMap() {
		Map<Integer, String> htr = new HashMap<Integer, String>();
		
		htr.put(11, "Milan");
		htr.put(2, "Mike");
		htr.put(34, "Charles");
		htr.put(24, "Huang");
		htr.put(56, "Oscar");
		
		Map<Integer, String> htr1 = new TreeMap<Integer, String>(htr);
		
		System.out.println(htr1);
		
		
	}

}

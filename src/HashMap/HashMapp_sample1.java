package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapp_sample1 {
	
	public static void main(String[] args) {
		
		HashMap < Integer, String >  map = new HashMap < Integer, String > ();
		
		// adding Employee id and Employee name in Map
		
		map.put(101, "Nitin");
		map.put(102, "Ashvin");
		map.put(103, "Anil");
		map.put(104, "Rathod");
		map.put(105, "Avyan");
		map.put(106, "Nikita");
		
		// find the size of Map
		
		System.out.println(map.size()); 
		
		// Remove pairs from the map
		
		map.remove(101);
		
		System.out.println(map);  // updated one : {102=Ashvin, 103=Anil, 104=Rathod, 105=Avyan, 106=Nikita}

		// to find value of perticular key
		
		System.out.println(map.get(105));  // Avyan
		
		// get all the keys from map
		
		System.out.println(map.keySet());  //  [102, 103, 104, 105, 106] 
		
		// get all values from given map
		
		System.out.println(map.values()); // [Ashvin, Anil, Rathod, Avyan, Nikita]
		
		// get the key and value pairs
		
		System.out.println(map.entrySet()); // [102=Ashvin, 103=Anil, 104=Rathod, 105=Avyan, 106=Nikita]
		
		
		
		
		// print the value by using for each loop
		
		for ( Integer keys:map.keySet()) {
			
			System.out.println( keys  +" "+ (map.get(keys)));
		}
		
	}

}

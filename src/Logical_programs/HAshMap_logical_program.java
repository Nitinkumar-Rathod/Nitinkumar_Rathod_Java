package Logical_programs;

import java.util.HashMap;

public class HAshMap_logical_program {
	
	public static void main(String[] args) {
		
		occuranceofNumber ();
		occuranceofCharacter();
		occuranceofString();
	}
	
	
	
	public static void occuranceofNumber () {
	// find thee occurance of number
	
	int ar1 [] = {10,20,30,40,50,60,50,10,50};
	
	HashMap <Integer ,Integer> map = new  HashMap <> ();
	
	for (int i=0; i<ar1.length ; i++) {
		
		if (map.containsKey(ar1[i])) {
			
			map.put(ar1[i], map.get(ar1[i])+1);
		}
		else {
			map.put(ar1[i], 1);
		}
	}
	System.out.println(map);
	
	for(int keys:map.keySet()) {
		
		System.out.println(keys + " :" + map.get(keys) );
	}
	System.out.println("The occurance of perrticular given number is " + map.get(50) + " Times");
	
	
	System.out.println("==================================================================");
	}
	
	
	public static void occuranceofCharacter () {
		
		// find thee occurance of char from given string
		
	   String name = "NITINKUMAR RATHOD";
	   HashMap <Character , Integer> map =new HashMap <> ();
	   for (int i=0; i<name.length(); i++) {
		   
		  char charvalue =name.charAt(i);
		  if(map.containsKey(charvalue)) {
			  
			  map.put(charvalue, map.get(charvalue)+1);
		  }
		  else {
			  map.put(charvalue, 1);
		  }
	   }
	   System.out.println(map);
		  
		  for (char keys:map.keySet()) {
			  
			  System.out.println(keys + ":" + map.get(keys));
	  }
		  System.out.println("Occurance of perticular character is " + map.get('H') + " times");
		  System.out.println("=============================================================");
	}
	public static void occuranceofString () {
		
		String ar1 [] = {"Apple","Banana" , "Mango" , "Orange", "Banana","Mango","Banana"};
		
		HashMap<String , Integer> map = new HashMap <> ();
		
		for (int i=0; i<ar1.length;i++) {
			
			if (map.containsKey(ar1[i])) {
				
				map.put(ar1[i], map.get(ar1[i])+1);
					
				}
			else {
				map.put(ar1[i], 1);
			}
				
		}
		System.out.println(map);
		
		for (String keys:map.keySet()) {
			
			System.out.println(keys + ":" + map.get(keys) );
		}
		System.out.println("occurance of given String in the given array is  " + map.get("Banana") + " Times");
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

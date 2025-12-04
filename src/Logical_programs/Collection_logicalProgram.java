package Logical_programs;

import java.util.HashSet;

public class Collection_logicalProgram {
	
	public static void main(String[] args) {
		
		Removeduplicate();
	}
	
	public static void Removeduplicate () {
		
		int ar1[] = { 10, 20, 30, 1, 30, 8, 48,10,25, 25, 11 };
		
		HashSet <Integer>  set = new HashSet ();

		for (int arr : ar1) {
			
			set.add(arr);
			
		}
		System.out.println("Unique value from given arrays are :- " + set);
	}

     
}

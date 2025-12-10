package Revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class section1_2 {

	public static void main(String[] args) {

		m1(); // common element
		m2(); // even odd
		m3(); // 1st largest
		m4(); // 1st largest
		m5(); // 2nd largest
		m6(); // 2nd largest
		m7(); // occurance of char
		m8(); // occurance of number
		m9(); // occurance of String
		m10(); // palindrome
		m11(); // prime no
		m12(); // random number
		m13(); // remove duplicates
		m14();  // rremove space
		m15();   // reverse string
		m16();  // space count
		m17();  // space count 2nd way
		m18();  // upper_lowecase count
		System.out.println("====================================================");
		star1();
		System.out.println("====================================================");
		star3();
		System.out.println("====================================================");
		star4();
		System.out.println("====================================================");
		star5();
		System.out.println("====================================================");
		star6();
		System.out.println("====================================================");
		star7();
		System.out.println("====================================================");


		

	}

	public static void m1() {

		// find the common elements from the given array

		int ar1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int ar2[] = { 1, 3, 2, 8, 9 };
		int count = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int arr : ar1) {

			set.add(arr);
		}
		for (int arr1 : ar2) {
			if (set.contains(arr1)) {

				System.out.println(arr1);
				count++;
				set.remove(arr1);
			}
		}
		System.out.println("========================================================");
	}

	public static void m2() {

		// find the even odd number plus count of add and even no
		int ar1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int oddcount = 0;
		int evencount = 0;
		for (int arr : ar1) {
			if (arr % 2 == 0) {
				System.out.println(arr + "is Even no");
				evencount++;
			} else {
				System.out.println(arr + "is Even no");
				oddcount++;
			}

		}
		System.out.println("Total Even number count is :-" + evencount);
		System.out.println("Total odd number count is :-" + oddcount);
		System.out.println("========================================================");

	}

	public static void m3() {

		// find the largest value from given arra

		int ar1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int largest = ar1[0];
		for (int arr : ar1) {

			if (arr > largest) {

				largest = arr;
			}
		}

		System.out.println(largest);
		System.out.println("===============================================================================");

	}

	public static void m4() {

		// find the largest value from given array

		int ar1[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("The 1st largest value is " + Arrays.stream(ar1).sorted().max().getAsInt());
		System.out.println("===============================================================================");

	}

	public static void m5() {
		// find 2nd largest value from given array

		int ar1[] = { 1, 2, 3, 4, 5, 6, 7 };
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for (int arr : ar1) {

			if (arr > largest) {

				secondlargest = largest;
				largest = arr;
			} else if (arr > secondlargest && arr < largest) {
				secondlargest = arr;
			}
		}
		System.out.println(largest);
		System.out.println(secondlargest);
	}

	public static void m6() {
		// find 2nd largest value from given array

		int ar1[] = { 1, 2, 3, 4, 5, 6, 7 };

		Arrays.stream(ar1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();

	}

	public static void m7() {

		// find occurance_of_char from given String

		String name = "Nitinkumr Rathod";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {

			char charvalue = name.charAt(i);
			if (map.containsKey(charvalue)) {
				map.put(charvalue, map.get(charvalue) + 1);
			} else {
				map.put(charvalue, 1);
			}
			System.out.println(map);
			for (char keys : map.keySet()) {

				System.out.println(keys + ":" + map.get(keys));
			}
			System.out.println("the occurance of perticular given char is " + map.get('i') + " Times");
		}
	}

	public static void m8() {

		// find occurance_of_number from given array

		int ar1[] = { 1, 2, 3, 4, 5, 6, 7, 7 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int arr : ar1) {

			if (map.containsKey(arr)) {
				map.put(arr, map.get(arr) + 1);
			} else {
				map.put(arr, 1);
			}
		}
		System.out.println(map);

		for (int keys : map.keySet()) {

			System.out.println(keys + ":" + map.get(keys));
		}

		System.out.println("the occurance of given value is " + map.get(7) + " Times");

	}

	public static void m9() {

		// find occurance_of_Stringname from given array

		String ar1[] = { "Nitin", "Nitin", "Ashvin", "Anil" };

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String arr : ar1) {

			if (map.containsKey(arr)) {

				map.put(arr, map.get(arr) + 1);
			} else {

				map.put(arr, 1);
			}
		}
		System.out.println(map);
		for (String keys : map.keySet()) {
			System.out.println(keys + ":" + map.get(keys));

		}
		System.out.println("the occurance of given name in given array is " + map.get("Anil") + " Times");

	}

	public static void m10() {
		// CHECK THE GIVEN sTRING IS PALINDROME OR NOT
		String name = "NITIN";

		StringBuilder str = new StringBuilder();
		StringBuilder rev = str.append(name).reverse();
		System.out.println(rev);
		if (rev.toString().equals(name)) {

			System.out.println("The given String is a palindrome");
		} else {
			System.out.println("The given String is not a palindrome");

		}
	}

	public static void m11() {

		// check the gven is prime or not

		int a = 11;
		int count = 0;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				count++;
				break;
			}

		}
		if (count == 1) {
			System.out.println("The given no is not a Prime number");
		} else {
			System.out.println("The given no is  a Prime number");

		}
	}

	public static void m12() {

		int min = 100;
		int max = 1000;

		int a = (int) (Math.random() * (max - min) + min);

		System.out.println(a);
	}

	public static void m13() {
		// Remove_duplicates
		int ar1[] = { 1, 2, 3, 4, 5, 4, 6, 7, 7 };
		HashSet<Integer> set = new HashSet<>();
		for (int arr : ar1) {

			set.add(arr);
		}
		System.out.println(set); // output [1, 2, 3, 4, 5, 6, 7]
	}

	public static void m14() {

		// Remove the sace fom given string

		String Name = "Nitinkumar Rathod";

		String n = Name.replaceAll("\\s+", ""); // (\\s) means number of white space in the given string

		System.out.println(n);

	}

	public static void m15() {

		// Reverse string
		String name = "Nitin";
		String rev = "";
		for (int i = name.length()-1; i>=0; i--) {

			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
		System.out.println(" =============================OR=======================================");

		StringBuilder str = new StringBuilder(name);

		str.reverse();
		System.out.println(str);
		System.out.println(" =============================OR=======================================");
		
		char c[] = name.toCharArray();
		for(int i=name.length()-1 ; i>=0; i--) {
			
			System.out.print(c[i]);
		}
System.out.println();
	}

	public static void m16() { 
		
		// count the space from the given string
		
		String name = "n n Hd y h  s TR";
		int count = 0;
        char ar1[]= name.toCharArray();
        
        for (char arr:ar1) {
        	if(arr == ' ') {
        		count++;
        	}
        }
        System.out.println(count);
 }
	public static void m17() { 
		
		// count the space from the given string
		
		String name = "n n Hd y h  s TR";
		int count = 0;
	
		for (int i=0; i<=name.length()-1; i++) {
			
			char value =name.charAt(i);
		if (value == ' ') {
			count++;
		}
		}
		System.out.println(count);
		
	}
	public static void m18() {
		
		String name = "NiTIn";
		int upper = 0;
		int lower = 0;
		for (int i=0; i<=name.length()-1; i++) {
			
			char value=name.charAt(i);
			if(Character.isUpperCase(value)) {
				upper++;
			}else if (Character.isLowerCase(value)) {
				lower++;
			}
		}
		System.out.println("Upper " + upper);
		System.out.println("Lower " + lower);
	}
	
	
	public static void star1 () {

		/*

		 * * * * *    print this solid rectangular pattern
		 * * * * * 
		 * * * * * 
		 * * * * *

		 */
		
		int row =4;
		int star = 5;
		for (int i=0; i<row ; i++) {
			
			for(int a=0; a<star; a++){
				
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	public static void  star3 () {

		/*

		 * 
		 **
		 ***      print half pyramid
		 ****

		 */
		
		int row = 4;
		int star =1;
		
		for (int i=0; i<row ; i++) {
			
			for (int a=0; a<star ; a++) {
				System.out.print("*" + " ");
				
			}
			System.out.println();
			star++;
		}
		
	}
	
	public static void star4 () {


		/*
		****
        ***
        **
        *        */
	
	int row =4;
	int star= 4;
	
	for (int i=row; i>0 ; i--) {
		
		for (int a=star; a>0 ; a--) {
			
			System.out.print("*" + " ");
		}
		System.out.println();
		star--;
	}
	}
	public static void star5 () {

		/*         
		 *
        **
       ***
      ****      */
		int row = 4;
		int space = 3;
		int star=1;
		for (int i=0; i<row ; i++) {
			for(int a=0; a<space; a++) {
				System.out.print(' ');
			}
			for (int j=0; j<star ; j++) {
				
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
	}
	public static void star6 () {

		/*
		 ****
          ***
           **
            *
		 */
	
		int row = 4;
		int space = 0;
		int star=4;
		
		for (int i=1; i<=row; i++) {
			
			for (int j=1; j<=space ; j++) {
				
				System.out.print(' ');
			}
			for (int k=1; k<=star ; k++) {
				
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}
	public static void star7 () {

		/*
		  *
         ***
        *****
       *******	
		 */
		int row = 4;
		int space=3;
		int star=1;
		
		for (int i=1; i<=row; i++) {
			
			for(int j=1; j<=space ; j++) {
				System.out.print(' ');
			}
			for (int k=1; k<=star ; k++) {
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space --;;
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

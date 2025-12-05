package Logical_programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class All_logical_programs {
	public static void main(String[] args) {

		All_logical_programs n1 = new All_logical_programs ();

		n1.commen_element();
		n1.even_odd();
		n1.largest();
		n1.second_largest();
		n1.occurance_of_char();
		n1.occurance_of_number();
		n1.occurance_of_String();
		n1.palindrome();
		n1.prime_no();
		n1.random_no();
		n1.Remove_duplicates();
		n1.remove_space();
		n1.revers_String();
		n1.space_count();
		n1.upper_lowercase();
		n1.star1();
		n1.star2();
		n1.star3();
		n1.star4();
		n1.star5();
		n1.star6();
		n1.star7();
		n1.SortNamesByLength();
		n1.SortNamesByLengthDesc();





	}
	public void commen_element () {

		// there are two int array find the common element form the given array

		int ar1 [] = {1,2,3,4,5,6,7};
		int ar2 [] = {1,3,5,8,9};
		HashSet <Integer> set= new HashSet<>();
		int count =0;
		for (int i=0; i<=ar1.length-1; i++) {

			set.add(ar1[i]);
		}
		for(int a=0; a<=ar2.length-1; a++) {

			if(set.contains(ar2[a])) {
				count++;
				System.out.println(ar2[a]);
				set.remove(ar2[a]);
			}
		}
		System.out.println("Commen elements are :- "+count);

		System.out.println("================================================================================");

	}

	public void even_odd () {

		// find the even and value

		int ar1 [] = { 1,2,3,4,5,6,7,8,9,12};

		int even = 0;
		int odd=0;

		for(int i=0; i<=ar1.length-1; i++) {

			if(ar1[i]%2==0) {

				even++;
				System.out.println("Even " + ar1[i]);
			}
			else {
				odd++;
				System.out.println("Odd " + ar1[i]);

			}


		}
		System.out.println("Total Even value = " + even);
		System.out.println("Total Odd value = " + odd);

		System.out.println("========================================================================");



	}
	//find  largest value from given array

	public void largest () {

		int ar1 []= {12,13,1,4,15,22,44,55};

		int largest = ar1[0];

		for(int i=0; i<=ar1.length-1; i++) {

			if(ar1[i]>largest) {
				largest=ar1[i];
			}
		}

		System.out.println("largest value is :- " + largest);

		System.out.println("=============================================================================");
	}
	//find second largest value from given array

	public void second_largest () {

		int ar1 [] = {12,14,13,15,44,55};

		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;

		for(int arr:ar1) {

			if(arr>largest) {
				second_largest=largest;
				largest=arr;
			}
			else if (arr>second_largest && arr<largest) {

				second_largest=arr;
			}
		}

		System.out.println("Second largest value is :- " + second_largest);

		System.out.println("=============================================================================");

	}

	public void occurance_of_char () {

		String name = "Nitinkumr Rathod";

		HashMap <Character, Integer> map = new HashMap <>();

		for (int i=0; i<=name.length()-1;i++) {

			char charvalue =name.charAt(i);

			if (map.containsKey(charvalue)) {

				map.put(charvalue, map.get(charvalue)+1);
			}
			else {

				map.put(charvalue, 1);
			}
		}
		System.out.println(map);


		for(char keys:map.keySet()) {

			System.out.println(keys + ":" + map.get(keys));
		}
		System.out.println(("the perticular char i comes " + map.get('i') + " times"));

		System.out.println("=============================================================================");

	}
	public void occurance_of_number (){

		// find the occurance of number from given array

		int ar1 [] = { 11,11,22,33,22,44,55,33,33,55};

		HashMap <Integer,Integer> map = new HashMap <>();

		for(int i=0; i<=ar1.length-1; i++) {

			if(map.containsKey(ar1[i])){

				map.put(ar1[i], map.get(ar1[i])+1);
			}
			else {
				map.put(ar1[i], 1);
			}
		}
		System.out.println(map);

		for (int keys:map.keySet()){

			System.out.println(keys + ":" + map.get(keys));
		}
		System.out.println("the perticular value 22 is occures " + map.get(22) +" Times");

		System.out.println("==========================================================================");
	}
	public void occurance_of_String () {

		String ar1 [] = { "Apple" , "Banana" , "Mango", "Apple" , "Mango", "Apple", "Banana" };

		HashMap <String , Integer> map = new HashMap <> ();

		for (int i=0; i<=ar1.length-1; i++) {

			if(map.containsKey(ar1[i])) {

				map.put(ar1[i], map.get(ar1[i])+1);
			}
			else {
				map.put(ar1[i], 1);
			}
		}
		System.out.println(map);

		for (String keys:map.keySet()) {

			System.out.println(keys + ":" + map.get(keys));
		}
		System.out.println("The Word Apple occures " + map.get("Apple") + "Times ");

		System.out.println("========================================================================");

	}
	public void palindrome () {

		String name = "NITIN";
		String nevstr = "";
		for (int i=0; i<=name.length()-1; i++) {

			nevstr = nevstr + name.charAt(i);
		}
		if(name.equals(nevstr)) {

			System.out.println("The given String is palindrome ");
		}
		else {

			System.out.println("The given String is not palindrome ");

		}
		System.out.println("========================================================================");

	}

	public void prime_no () {

		int number=11;

		int count =0;

		for(int i=2; i<number ; i++) {

			if(number % i == 0  ) {

				count++;
				break;
			}


		}
		if(count == 1) {

			System.out.println("given no is not a prime no");
		}
		else {
			System.out.println("given no is a prime no");

		}
		System.out.println("========================================================================");

	}
	public void random_no () {

		int min =10;
		int max = 100;

		int b =(int) (Math.random ()*(max-min)+min);
		System.out.println("The random no is :- "+b);

		System.out.println("======================================================================");
	}
	public void Remove_duplicates () {

		int ar1 []= {1,2,3,4,5,1,23,4,3,3,6,7};

		HashSet <Integer> set = new HashSet<>();

		for (int i=0; i<=ar1.length-1; i++) {

			set.add(ar1[i]);
		}

		System.out.println(set);

		System.out.println("======================================================================");


	}
	public void remove_space () {

		String text = "Nitin   Rathod  i  s Q A  Analyst";

		String new_text=text.replaceAll("\\s+", "");

		System.out.println(new_text);

		System.out.println("======================================================================");

	}
	public void revers_String () {

		String name = "Nitinkumar";
		String rev ="";
		for(int i=name.length()-1; i>=0; i--) {

			rev =rev + name.charAt(i);
		}
		System.out.println(rev);

		System.out.println("=============or || or  || or=================");

		char ar1[] =name.toCharArray();

		for (int i=ar1.length-1; i>=0; i--) {

			System.out.print(ar1[i]);
		}
		System.out.println();
		System.out.println("=============or || or  || or=================");

		StringBuilder s1 = new StringBuilder ();

		s1.append (name);
		s1=s1.reverse();
		System.out.println(s1);
		System.out.println("==============================================");
	}

	public void space_count () {

		String text = "j hf shn ff d s ww  ";
		int count =0; 
		for(int i=0; i<=text.length()-1; i++) {

			char charvalue =text.charAt(i);

			if(charvalue == ' ') {

				count ++;
			}
		}
		System.out.println("Total no of Spaces in this String are " +count);
		System.out.println("==============================================");

	}
	public void upper_lowercase () {

		String text = "hJHGjhdJHJhdnbdGJfGJ";
		int upper=0;
		int lower=0;
		for (int i=0; i<=text.length()-1;i++) {

			char charvalue =text.charAt(i);
			if(Character.isUpperCase(charvalue)) {
				upper++;
			}
			else if (Character.isLowerCase(charvalue)) {
				lower++;
			}
		}
		System.out.println("Total uppercase letter in given string " +upper);
		System.out.println("Total lowercase letter in given string " +lower);
		System.out.println("================================================================");

	}

	public void star1 () {

		/*

		 * * * * *    print this solid rectangular pattern
		 * * * * * 
		 * * * * * 
		 * * * * *

		 */

		int row = 4;
		int star = 5;

		for(int i=0; i<row ;i++) {

			for (int j=0; j<star; j++ ) {

				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("================================================================");

	}
	public void star2 () {
		/*

		 * * * * *
		 *       *         print hollow rectangle
		 *       *
		 * * * * *

		 */

		int row= 4;
		int star = 5;

		for(int i=1; i<=row; i++) {

			for(int j=1; j<=star; j++) {

				if(i==1 || j==1 || i==row || j == star) {

					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("================================================================");

	}
	public void  star3 () {

		/*

		 * 
		 **
		 ***      print half pyramid
		 ****

		 */

		int star=1;
		int row = 4;

		for (int i=1; i<=row; i++) {

			for(int j=1; j<=star; j++) {

				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		System.out.println("======================================================");
	}
	public void star4 () {


		/*
		****
        ***
        **
        *        */
		int row = 4;
		int star = 4;
		for (int i=1; i<=row ; i++) {

			for(int j=1; j<=star; j++) {

				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		System.out.println("================================================================================");

	}
	public void star5 () {

		/*         
		 *
        **
       ***
      ****      */

		int row = 4;
		int star = 1;
		int space =3;

		for(int i=1; i<=row; i++) {

			for(int j =1; j<=space; j++) {
				System.out.print(' ');
			}
			for(int k=1; k<=star; k++) {

				System.out.print("*");
			}
			System.out.println();
			space--;
			star ++;
		}
		System.out.println("================================================================================");


	}
	public void star6 () {

		/*
		 ****
          ***
           **
            *
		 */

		int row = 4;
		int star =4;
		int space = 0;

		for(int i=1; i<=row ; i++) {

			for(int j=1; j<=space; j++) {
				System.out.print(' ');
			}
			for(int k=1; k<=star; k++) {

				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		System.out.println("================================================================================");

	}

	public void star7 () {

		/*
		  *
         ***
        *****
       *******	
		 */
		int row = 4;
		int star = 1;
		int space =3;

		for (int i=1; i<=row ; i++) {

			for(int j=1; j<=space ; j++) {

				System.out.print(' ');
			}
			for(int k=1; k<=star; k++) {

				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}
		System.out.println("================================================================================");

	}
	public void SortNamesByLength  () {
		// Step 1: Put names in a Map with name and length
		Map<String, Integer> nameLengthMap = new HashMap<>();
		nameLengthMap.put("RahulVerma", 10);   // 1st name (10 letters)
		nameLengthMap.put("AmitKumar", 8);     // 2nd name (8 letters)
		nameLengthMap.put("Ravi", 4);          // 3rd name (4 letters)
		// Step 2: Sort names by length
		List<Map.Entry<String, Integer>> nameList = new ArrayList<>(nameLengthMap.entrySet());

		nameList.sort(Comparator.comparingInt(Map.Entry::getValue)); // ascending order

		// Step 3: Print sorted names
		System.out.println("Names in ascending order of character length:");
		int position = 1;
		for (Map.Entry<String, Integer> entry : nameList) {
			System.out.println(position + ". " + entry.getKey() + " (" + entry.getValue() + " characters)");
			position++;
		}

	}
	public void SortNamesByLengthDesc  () {
		  // Step 1: Put names in a Map with name and length
        Map<String, Integer> nameLengthMap = new HashMap<>();
        nameLengthMap.put("RahulVerma", 10);   // 1st name (10 letters)
        nameLengthMap.put("AmitKumar", 8);     // 2nd name (8 letters)
        nameLengthMap.put("Ravi", 4);          // 3rd name (4 letters)

        // Step 2: Convert to list and sort by value in descending order
        List<Map.Entry<String, Integer>> nameList = new ArrayList<>(nameLengthMap.entrySet());

        nameList.sort((a, b) -> b.getValue() - a.getValue()); // descending sort

        // Step 3: Print sorted names
        System.out.println("Names in descending order of character length:");
        int position = 1;
        for (Map.Entry<String, Integer> entry : nameList) {
            System.out.println(position + ". " + entry.getKey() + " (" + entry.getValue() + " characters)");
            position++;
	}
	}
}



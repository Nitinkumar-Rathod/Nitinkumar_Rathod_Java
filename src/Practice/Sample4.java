package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Sample4 {

	public static void main(String[] args) {

		Sample4 s1 = new Sample4();
		s1.commonelement();
		System.out.println("==================================||00||=====================================");
		s1.EvenOdd();
		System.out.println("==================================||00||=====================================");
		s1.largest();
		System.out.println("==================================||00||=====================================");
		s1.largest3rdway();
		System.out.println("==================================||00||=====================================");
		s1.secondlargest1stway();
		System.out.println("==================================||00||=====================================");
		s1.secondlargest2nddway();
		System.out.println("==================================||00||=====================================");
		s1.secondlargest3rdway();
		System.out.println("==================================||00||=====================================");
		s1.startswith();
		System.out.println("==================================||00||=====================================");
		s1.occuranceofnumber();
		System.out.println("==================================||00||=====================================");
		s1.occuranceofSring();
		System.out.println("==================================||00||=====================================");
		s1.occuranceofchar();
		System.out.println("==================================||00||=====================================");
		s1.primenumber();
		System.out.println("==================================||00||=====================================");
		s1.randomno();
		System.out.println("==================================||00||=====================================");
		s1.fibonaki();
		System.out.println("==================================||00||=====================================");
		s1.star1();
		System.out.println("==================================||00||=====================================");
		s1.star2();
		System.out.println("==================================||00||=====================================");
		s1.star3();
		System.out.println("==================================||00||=====================================");
		s1.star4();
		System.out.println("==================================||00||=====================================");
		s1.star5();
		System.out.println("==================================||00||=====================================");
		s1.star6();
		System.out.println("==================================||00||=====================================");
		s1.removespace();
		System.out.println("==================================||00||=====================================");
		s1.spacecount();
		System.out.println("==================================||00||=====================================");
		s1.spacecount2ndway();
		System.out.println("==================================||00||=====================================");
		s1.word_countFromString();
		System.out.println("==================================||00||=====================================");
		s1.reverceString();
		System.out.println("==================================||00||=====================================");
		s1.reverceString2ndway();
		System.out.println("==================================||00||=====================================");
		s1.reverceString3rdway();
		System.out.println("==================================||00||=====================================");
		s1.countCharactor();
		System.out.println("==================================||00||=====================================");
		s1.countCharactor2ndway();
		System.out.println("==================================||00||=====================================");
		s1.countvowelsandconsonent();
		System.out.println("===============================================================");
		s1.pallandrome();
		System.out.println("===============================================================");
		palindromesecondway();
		System.out.println("===============================================================");
		s1.reverseSentence();
		System.out.println("===============================================================");
		s1.uppercase_lowercase_count();
		System.out.println("===============================================================");


	}

	public void commonelement() {
		int ar1[] = { 10, 15, 22, 18 };
		int ar2[] = { 10, 15, 18 };
		int count = 0;

		HashSet<Integer> set = new HashSet<>();
		
		for (int arr : ar1) {

			set.add(arr);
		}
		for (int arr2 : ar2) {

			if (set.contains(arr2)) {
				System.out.println("Duplicate value is :- " + arr2);
				count++;
				set.remove(arr2);
			}
		}
	}

	public void EvenOdd() {

		int ar1[] = { 10, 15, 22, 18 };
		int odd = 0;
		int even = 0;
		for (int arr : ar1) {

			if (arr % 2 == 0) {
				even++;
				System.out.println("Even :- " + arr);
			} else {
				odd++;
				System.out.println("Odd :- " + arr);
			}
		}
		System.out.println("total even count is  " + even);
		System.out.println("total odd count is  " + odd);

	}

	public void largest() {

		int ar1[] = { 10, 15, 22, 18 };
		int largest = ar1[0];

		for (int arr : ar1) {

			if (arr > largest) {
				largest = arr;
			}
		}

		System.out.println("largest value is " + largest);

		System.out.println("=================Or=================");

		System.out.println(Arrays.stream(ar1).sorted().max().getAsInt());

	}

	public void largest3rdway() {
		int ar1[] = { 10, 15, 22, 18 };
		int largest = ar1[0];

		for (int i = 0; i < ar1.length; i++) {

			if (ar1[i] >= largest) {
				largest = ar1[i];
			}
		}
		System.out.println(largest);
	}

	public void secondlargest1stway() {

		int ar1[] = { 10, 15, 22, 18 };
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int i = 0; i < ar1.length; i++) {

			if (ar1[i] > largest) {

				secondlargest = largest;
				largest = ar1[i];
			} else if (ar1[i] > secondlargest && ar1[i] < largest) {

				secondlargest = ar1[i];
			}
		}
		System.out.println("Second larget value is   :- " + secondlargest);

	}

	public void secondlargest2nddway() {

		int ar1[] = { 10, 15, 22, 18 };
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

		System.out.println("Secondlargest value is :- " + secondlargest);

	}

	public void secondlargest3rdway() {

		int ar1[] = { 10, 15, 22, 18 };

		System.out.println("Second largest value is :_ "
				+ Arrays.stream(ar1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

	}

	public void startswith() {

		String ar1[] = { "Nitin", "Name", "Ntr" };
		int count = 0;
		for (String arr : ar1) {

			if (arr.startsWith("N")) {
				count++;
			}
		}
		System.out.println("count of Name starts with N are  :- " + count);

	}

	public void occuranceofnumber() {

		int ar1[] = { 10, 10, 15, 22, 18 };
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int arr : ar1) {

			if (map.containsKey(arr)) {
				map.put(arr, map.get(arr) + 1);
			} else {
				map.put(arr, 1);
			}
		}
		System.out.println(map);
		System.out.println("the occurance of perticular given number is :- " + map.get(10) + " times");
	}

	public void occuranceofSring() {
		String ar1[] = { "Apple", "Banana", "Mango", "Orange", "Banana", "Mango", "Banana" };

		HashMap<String, Integer> map = new HashMap<>();

		for (String arr : ar1) {
			if (map.containsKey(arr)) {

				map.put(arr, map.get(arr) + 1);
			} else {
				map.put(arr, 1);
			}
		}
		System.out.println(map);
		System.out.println("occurance of given String is  :- " + map.get("Mango") + " Times");
		for (String key : map.keySet()) {

			System.out.println(key + ":" + map.get(key));
		}
	}

	public void occuranceofchar() {
		String name = " Nitin N";

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < name.length(); i++) {
			char charvalue = name.charAt(i);
			if (map.containsKey(charvalue)) {

				map.put(charvalue, map.get(charvalue) + 1);
			} else {
				map.put(charvalue, 1);
			}
		}
		System.out.println(map);
		System.out.println("occurance of perticular char :- " + map.get('N') + " Times");
	}

	public void primenumber() {

		int number = 11;
		int count = 0;
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("Not prime");
		} else {
			System.out.println(" prime");

		}
	}

	public void randomno() {

		int min = 100;
		int max = 2000;

		int randomvalue = (int) (Math.random() * (max - min) + min);
		System.out.println(randomvalue);
	}

	public void fibonaki() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public void star1() {

		/*
		 * 
		 * * * * * print this solid rectangular pattern * * * * * * * * * * * *
		 * 
		 */

		int row = 4;
		int star = 5;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < star; j++) {

				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void star2() {

		/*
		 * 
		 **
		 *** 
		 * print half pyramid
		 ****
		 * 
		 */
		int row = 4;
		int star = 1;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < star; j++) {

				System.out.print("*" + " ");
			}
			System.out.println();
			star++;
		}
	}

	public static void star3() {

		/*
		****
		***
		**
		*     */
		int row = 4;
		int star = 4; // star available in 1st row

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < star; j++) {

				System.out.print("*" + " ");
			}
			System.out.println();
			star--;
		}
	}

	public static void star4() {

		/*         
		*
		**
		***
		****      */

		int row = 4;
		int star = 1;
		int space = 3;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}

	}

	public static void star5() {

		/*
		 ****
		  ***
		   **
		    *
		 */

		int row = 4;
		int star = 4;
		int space = 0;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}
	}

	public static void star6() {

		/*
		  *
		 ***
		*****
		*******	
		 */
		int row = 4;
		int star = 1;
		int space = 3;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < space; j++) {

				System.out.print(' ');
			}
			for (int k = 0; k < star; k++) {

				System.out.print("*");
			}
			System.out.println();
			star = star + 2;
			space--;
		}
	}

	public void removespace() {

		String text = "my name is Nitin";
		System.out.println(text.replaceAll("\\s+", ""));
	}

	public void spacecount() {
		String text = "my name is Nitin";
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Space count is " + count);
	}

	public void spacecount2ndway() {
		String text = "my name is Nitin";
		int count = 0;
		char newtext[] = text.toCharArray();
		for (char n : newtext) {
			if (n == ' ') {
				count++;
			}
		}
		System.out.println("Number of space count is " + count);
	}

	public void word_countFromString() {
		int count = 1;
		String text = "Nitin Rathod is a Sr QA Engineer";

		for (int i = 0; i <= text.length() - 1; i++) {

			char value = text.charAt(i);

			if (value == ' ') {
				count++;
			}
		}
		System.out.println("Total count of Words in Given String is :- " + count);
	}

	public void reverceString() {

		String Name = "Nitinkumar";
		String rev = "";
		for (int i = Name.length()-1; i >= 0; i--) {
			rev = rev + Name.charAt(i);
		}
		System.out.println("Reverce string is : - " + rev);
	}

	public void reverceString2ndway() {

		String Name = "Nitinkumar";
		
		StringBuilder str = new StringBuilder (Name);
		StringBuilder newstr=str. reverse();
		System.out.println(newstr);
	}
	public void reverceString3rdway() {

		String Name = "Nitinkumar";
		String rev = "";
		char ar1 [] =Name.toCharArray();
		for (int i=ar1.length-1; i>=0; i--) {
			
			 rev=rev+ar1[i];
		}
		System.out.println(rev);
	}
	public void countCharactor () {
		
		 String name =" Nitiinkumar Anil Rathod";
		 int count =0;
		 for (int i=0; i<=name.length()-1;  i++) {
			 
			 if (name.charAt(i) != ' ') {
				 
				 count++;
			 }
		 }
		 System.out.println("Number of character count in given string is :- " + count);
	}
	public void countCharactor2ndway () {
		
		 String name =" Nitiinkumar Anil Rathod";
		 
		 System.out.println("total char in the given String is " + name.replaceAll("\\s+", "").length());
		 
	}
	
	public void countvowelsandconsonent () {
		
		String s1 = "This is a really simple sentence";
		s1 = s1.toLowerCase();
		int vcount = 0;
		int ccount = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vcount++;
			} else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				ccount++;
			}

		}

		System.out.println("vowel cout =" + vcount + " and consenent count =" + ccount);
	}

	public void pallandrome() {
		String org = "NITIN";
		String rev = "";

		for (int i = org.length() - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);
		}
		if (org.equals(rev))
			System.out.println("given string is pallandrome");

		else
			System.out.println("given string is  not pallandrome");
	}

	public static void palindromesecondway() {
		// CHECK THE GIVEN sTRING IS PALINDROME OR NOT
		String name = "NITIN";

		StringBuilder str = new StringBuilder();
		StringBuilder rev = str.append(name).reverse();

		if (rev.toString().equals(name)) { // StringBuilder.equals() object reference compare karta hai, content compare
											// nahi karta. manhun tostring use kel

			System.out.println("The given String is a palindrome");
		} else {
			System.out.println("The given String is not a palindrome");

		}
	}

	public void reverseSentence() {
		String org = "Best of luck";
		String rev = "";
		String s1[] = org.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {

			rev = rev + " " + s1[i];
		}
		System.out.println(rev);
	}

	public void uppercase_lowercase_count() {

		String text = "hJHGjhdJHJhdnbdGJfGrJ";
		int upper = 0;
		int lower = 0;

		for (int i = 0; i < text.length(); i++) {

			char charvalue = text.charAt(i);
			if (Character.isUpperCase(charvalue)) {
				upper++;
			} else if (Character.isLowerCase(charvalue)) {
				lower++;
			}
		}
		System.out.println("Total upper case char count is :-" + upper);
		System.out.println("Total lower case char count is :-" + lower);
	}
}

	
	
	
	
	
	
	
	



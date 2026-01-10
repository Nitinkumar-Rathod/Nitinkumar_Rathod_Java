package Logical_programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Alllogicalprogramspractice {

	static int ar1[] = { 10, 20, 30, 1, 8, 48, 25, 51 };

	public static void main(String[] args) {

		evenodd();
		largestvalue();
		largestvalue2ndway();
		secondlargestvalue();
		secondlargestvalue2ndway();
		Startswih();
		Removeduplicate();
		occuranceofNumber();
		occuranceofChar();
		occuranceofString();
		primenumber();
		randomnumber(10, 15);
		randomnumber2ndway(35, 28);
		febonakiserice();
		Armstrong_number();
		Star_solid_rectangular();
		star2();
		star3();
		star4();
		remove_space();


	}
	public static void evenodd () {
		int Evencount = 0;
		int Oddcount = 0;
		for (int arr:ar1) {

			if(arr%2 == 0) {
				System.out.println(arr  + " is Even no");
				Evencount++;
			}else {
				System.out.println(arr  + " is Odd no");
				Oddcount++;
			}
		}
		System.out.println("Total even numbers are :- " + Evencount);
		System.out.println("Total Odd numbers are :- " + Oddcount);

		System.out.println("===========================================================================");
	}

	public static void largestvalue () {

		int largest = ar1[0];

		for (int arr:ar1) {

			if(arr > largest) {
				largest = arr;
			}
		}
		System.out.println("Largest value is :- " + largest);
		System.out.println("===========================================================================");

	}
	public static void largestvalue2ndway () {

		System.out.println("Largest value is :- " + Arrays.stream(ar1).sorted().max().getAsInt());
		System.out.println("===========================================================================");

	}

	public static void secondlargestvalue () {

		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int arr:ar1) {

			if(arr > largest) {
				secondlargest = largest;
				largest = arr;
			}
			else if (arr>secondlargest && arr < largest ) {

				secondlargest = arr;
			}
		}
		System.out.println("Second largest value is :- " + secondlargest );
		System.out.println("===========================================================================");
	}
	public static void secondlargestvalue2ndway () {

		System.out.println("Second largest value is :- " + Arrays.stream(ar1).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

		System.out.println("===========================================================================");
	}
	public static void Startswih () {

		String ar1[] = { "Nitin", "Anil", "Ashvin", "Avyan" };
		int count =0;
		for (String arr : ar1) {

			if (arr.startsWith("A")) {
				count++;
			}
		}
		System.out.println("Total name which starts with A  are :- " + count );
		System.out.println("===========================================================================");

	}

	public static void Removeduplicate () {

		int ar2 []  = {22,58,46,49,49,58,49};

		HashSet  set = new HashSet  ();

		for (int arr:ar2) {
			set.add(arr);
		}
		System.out.println("Unique value from given arrays are :- " + set);
		System.out.println("===========================================================================");

	}
	public static void occuranceofNumber () {
		int ar1 [] = {10,20,30,40,50,60,50,10,50};
		HashMap <Integer , Integer> map = new HashMap <Integer , Integer> ();
		for(int arr : ar1 ){

			if(map.containsKey(arr)) {
				map.put(arr, map.get(arr)+1);
			}
			else {
				map.put(arr, 1);
			}

		}
		System.out.println(map);
		System.out.println("===========================================================================");

	}
	public static void occuranceofChar () {

		String Name = "Nitinkumar";

		char ar1 [] =Name.toCharArray();
		HashMap <Character , Integer> map = new HashMap <Character , Integer> ();

		for(char arr : ar1) {
			if(map.containsKey(arr)){
				map.put(arr, map.get(arr)+1);
			}else {
				map.put(arr, 1);
			}
		}
		System.out.println(map);
		System.out.println("===========================================================================");


	}
	public static void occuranceofString () {
		String ar1 [] = {"Nitin","Nitin","Nitin","Nitin","Ashvin","Ashvin"};
		HashMap <String , Integer> map = new HashMap <String , Integer> ();
		for(String arr : ar1 ){

			if(map.containsKey(arr)) {
				map.put(arr, map.get(arr)+1);
			}
			else {
				map.put(arr, 1);
			}

		}
		System.out.println(map);
		System.out.println("===========================================================================");

	}

	public static void primenumber () {

		int number =11
				;
		int count = 0;

		for (int i=2; i<number ; i++) {

			if(number % i == 0) {
				count++;
				break;
			}
		}
		if(count == 1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
	public static  void randomnumber (int max , int min) {
		int number = (int) (Math.random()*(max-min)+min);
		System.out.println(number);
	}
	public static  void randomnumber2ndway (int max , int min) {
		Random rand = new Random ();
		int number= rand.nextInt((max-min)+1)+min ;
		System.out.println(number);
	}

	public static void febonakiserice () {

		// calculate thee sum of 1 to 10 no
		int sum =0;
		for(int i=0; i<=10 ; i++) {

			sum =sum + i ;
		}
		System.out.println("Sum of 1 to 10 digits are " + sum);
	}
	public static void Armstrong_number () {

		int number = 153;
		int sum =0;
		for(int i=number ; i>0 ; i=i/10) {
			int rem=i%10;
			sum= sum + (rem*rem*rem);
		}
		if(number==sum) {
			System.out.println("Artmstrong");
		}else {
			System.out.println("not");
		}
	}
	public static void Star_solid_rectangular () {

		/*

		 * * * * *    print this solid rectangular pattern
		 * * * * * 
		 * * * * * 
		 * * * * *

		 */
		int row =4;
		int star = 5;

		for(int i=1; i<=row;i++) {

			for (int j=0; j<=star ; j++) {

				System.out.print("*" + " ");
			}
			System.out.println();

		}
		System.out.println("===========================================================================");

	}
	public static void  star2 () {

		/*

		 * 
		 **
		 ***      print half pyramid
		 ****

		 */
		int row =4;
		int star = 1;  

		for(int i=1; i<=row;i++) {

			for (int j=1; j<=star ; j++) {

				System.out.print("*");
			}
			star++;
			System.out.println();

		}
		System.out.println("===========================================================================");

	}
	public static void star3 () {


		/*
		 ****
		 ***
		 **
		 *     */
		int row =4;
		int star = 4;    // star available in 1st row

		for(int i=1; i<=row;i++) {

			for (int j=1; j<=star ; j++) {

				System.out.print("*");
			}
			star--;
			System.out.println();

		}
		System.out.println("===========================================================================");


	}
	public static void star4 () {

		/*         
		 *
		 **
		 ***
		 ****      */

		int row = 4;
		int star =1;
		int space =3;

		for (int i=1; i<=row ;i++) {

			for (int j=1; j<=space ;j++) {
				System.out.print(' ');
			}
			for (int k=1; k<=star ;k++) {
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();
		}
		System.out.println("===========================================================================");

	}
	public static void remove_space () {

		String text = "Rath od Ni ti n ";
		String newtext=text.replaceAll("\\s+", "");
		System.out.println(newtext);
	}
	public static void spacecount () {
		String text = "Rath od Ni ti n ";
    for (int i=0; i<=text.length()-1; i++) {
    	
    	
    }

	}
	}

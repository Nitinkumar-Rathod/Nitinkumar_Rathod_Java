package Logical_programs;

import java.util.Random;

public class Random_number {

	public static void main(String[] args) {
		
		secondway ();
		getRandomNumberBetween(10,200);
		
	}
	public static void getRandomNumberBetween(int min, int max) {

	    Random number = new Random();
	    int randomNo = number.nextInt((max - min) + 1) + min;
	    System.out.println(randomNo);
	}

	public static void secondway () {
		int min = 10;
		int max =1000;
		
		int random_no = (int) (Math.random()*(max-min)+min);
		System.out.println("Rando number is :- " + random_no);
		
		
	}
}

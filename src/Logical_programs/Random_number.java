package Logical_programs;

public class Random_number {

	public static void main(String[] args) {
		
	int min = 10;
	int max =1000;
	
	int random_no = (int) (Math.random()*(max-min)+min);
	System.out.println("Rando number is :- " + random_no);
	
	}
}

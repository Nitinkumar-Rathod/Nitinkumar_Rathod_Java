package Logical_programs;

public class Prime_number {
	
	public static void main(String[] args) {
		
		int number = 11;
		boolean isPrime = true;
		for(int i=0; i<number ; i++) {
			
			if (number % i == 0) {
				
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			
			System.out.println("Given number is prime number");
		}
		else {
			System.out.println("Given number is not a prime number");

		}
		
	}
}

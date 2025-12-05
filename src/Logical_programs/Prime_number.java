package Logical_programs;

public class Prime_number {

	public static void main(String[] args) {

		int number = 8;
		int count = 0;
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {

				count++;
				break;
			}
		}
		if (count == 1) {

			System.out.println("Given number is not a prime number");
		} else {
			System.out.println("Given number is a prime number");

		}

	}
}

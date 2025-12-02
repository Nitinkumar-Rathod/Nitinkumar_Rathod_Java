package Control_statement;

public class if_else_if {

	public static void main(String[] args) {

		int Marks = 57;

		if (Marks >= 35 && Marks < 60 ) {

			System.out.println("Congratulations! You passed.");
		}
		else if (Marks >= 60 && Marks <75) {

			System.out.println("Congratulations! You passed with 1st class.");

		}
		else if (Marks >= 75) {

			System.out.println("Congratulations! You passed with 1st class distinction.");

		}

		else {
			System.out.println("You are Fail");
		}
	}

}

package Control_statement;

public class If_Statement {

	// Control statements in Java are the statements that change the execution flow of the program based on 
	// the given condition(s). If the first condition is not satisfied, it moves to the next condition.

	String  name = "Nitin";

	public void m1 () {

		if (name=="Nitin") {

			System.out.println("Nitinkumar Anil Rathod");
		}
	}
	public void m2 () {

		if (name.equalsIgnoreCase("Nitin")) {

			System.out.println("Congratulation Nitin you are Placed in MNC with 22LPA");
		}
	}
	public static void main(String[] args) {

		If_Statement obj1 = new If_Statement ();
		obj1.m1();
		obj1.m2();

	}


}

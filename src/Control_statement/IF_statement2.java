package Control_statement;

public class IF_statement2 {

	String Name = "Nitin";
	String Status = "Cleared";

	public static void main(String[] args) {

		IF_statement2  obj1 = new IF_statement2 ();
		obj1.m1();

	}
	public void m1 () {

		if (Name.equalsIgnoreCase("Nitin") && Status.equalsIgnoreCase("Cleared")) {

	System.out.println("Congratulations Nitinkumar..!! You have been placed in a top MNC with a package of 25 LPA! ");
		}

	}
}

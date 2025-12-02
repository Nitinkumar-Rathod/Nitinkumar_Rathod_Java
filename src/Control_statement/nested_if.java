package Control_statement;

public class nested_if {

	String User_Name = "Nitinkumar";
	String Password = "Nitin@123";

	public static void main(String[] args) {

		nested_if obj1 = new nested_if ();
		obj1.M1();

	}
	public void M1 () {
		if (User_Name == "Nitinkumar") {
        
			System.out.println("Valid Username");
			
			if(Password == "Nitin@123") {
				
				System.out.println("Valid password login Sucessful..!!");
			}
			else {
				System.out.println("Invalid  Password..!!");
			}
		}
		else {
			System.out.println("Invalid  Username..!!");
		}
		
	}
	 

}

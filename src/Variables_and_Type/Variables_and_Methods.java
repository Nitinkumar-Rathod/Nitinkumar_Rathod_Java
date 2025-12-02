package Variables_and_Type;

public class Variables_and_Methods {

	public static void main(String[] args) {

		Variables_and_Methods  obj1 = new Variables_and_Methods ();
		obj1.variables();
		static1();
		variables_and_Methods2.static2();
		obj1.nonstatic1();
		
		variables_and_Methods2 obj2 = new variables_and_Methods2 ();
		obj2.nonstatic2();
	}
	
	
	public void variables () {

		String Name = "Nitin Rathod 18-02"; 
		byte   Roll_no = 127;
		short  Roll_no2 = 1001;
		int hallticketno = 49839; 
		long studentmobno = 9067486794L;
		float studentwt = 72.32F;
		double studentpercentage = 83.4000000;
		char  studentgrade = 'A';
		boolean studentstatus = true;

		System.out.println(Name);
		System.out.println("Roll_no = "+Roll_no);
		System.out.println("Roll_no = "+Roll_no2);
		System.out.println("hallticketno = "+hallticketno);
		System.out.println("studentmobno = "+studentmobno);
		System.out.println("studentwt = "+studentwt);
		System.out.println("studentpercentage = "+studentpercentage);
		System.out.println("studentgrade = "+studentgrade);
		System.out.println("studentstatus = "+studentstatus);

		System.out.println("====================================Static Method==============================");

	}


	public static void static1 () {

		System.out.println("if we want to call the static method from same class, then we can call by method name only");
	
		System.out.println("====================================Static Method==============================");

	}
	public static void nonstatic1 () {

		System.out.println("if we want to call the non static method from same class, then we can call by obj.method name ");
	
		System.out.println("====================================Static Method==============================");

	}
	
}

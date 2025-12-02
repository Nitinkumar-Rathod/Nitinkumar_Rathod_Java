package Basic_Java;

public class Practice {
	
	public static void main(String [] args) {
		
		String task = " In this class we will do the practice of simple variable and"
				+ " simple static and not static methods";
		System.out.println("Task :- " + task);
		
		Practice obj1 = new Practice ();

		obj1.nonstatic();
		Static_method();
		
	}
	public void nonstatic () {
		
		// char , int , short ,long , float , double ,  boolean
		
		String Student_Name = "Nitin kumar anil Rathod";
		char Grade ='A';
		int  Roll_No = 906748;
		short id_no = 55;
		long mob_no = 9067486794l;
		byte std = 5;
		float percentage = 71.30f;
		double percentage_4_digite = 71.4000;
		
		System.out.println(Student_Name);
		System.out.println(Grade);
		System.out.println(Roll_No);
		System.out.println(id_no);
		System.out.println(mob_no);
		System.out.println(std);
		System.out.println(percentage);
		System.out.println(percentage_4_digite);
		
	}
	public static void Static_method () {
		
		String gyan = "in static method we use static word and if we call it by using method name only wher as if we want to call the non static method the we need to create an object and we can call";
	
	System.out.println(gyan);}

}

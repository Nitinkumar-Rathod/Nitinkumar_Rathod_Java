package Methods_and_Constructor;

public class Sample1 {

	/*   Method is nothing but the block of code which run only when it is called.
	     also known as function

	     Main method :- it is nothing but the starting point of the program from where JVM start to
	     Program execution
	     Without main method we cannot Execute the program.

	     types :- 
	     1) Main method 
	     2) Regular mathod 
	        a) Static Regular mthod 
	        b) non tatic regular method.
	 */
	public static void main (String []args) {

		m1();
		Sample1 s1 = new Sample1 ();
		s1.m2();
		s1.m3(20, 20, "Marks");
		Sample2.m1();
		Sample2 s2 =new Sample2 ();
		s2.m2();

	}
	public static void m1 () {
		System.out.println("Static Method from Same class");
	}

	public  void m2 () {
		System.out.println("Non Static Method from Same class");

	}
	public void m3 (int a,int b, String c) {
		
		System.out.println(c + ":- " +(a+b));
	}


}

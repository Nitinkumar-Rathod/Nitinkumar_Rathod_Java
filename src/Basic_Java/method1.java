package Basic_Java;

public class method1 {


	public static void m1() {

       System.out.println("Static same class");
	}
	public static void m2(int a , int b) {

	       System.out.println(a+b);

	}
	public  void m3() {
	       System.out.println("non Static same class");

	}
	public  void m4(int c, int d) {

	       System.out.println(c+d);

	}
	method1 (){
		System.out.println("Constructor");
	}
	static {
		
		System.out.println("Static block executed");
	}
  public static void main(String[] args) {
	
	  method1 obj1 = new method1 ();
	  m1();
	  m2(2,3);
	  obj1.m3();
	  obj1.m4(20, 20);
	  
}
}

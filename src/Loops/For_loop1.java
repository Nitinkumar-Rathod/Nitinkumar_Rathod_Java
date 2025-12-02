package Loops;

public class For_loop1 {

	public static void main(String[] args) {

		For_loop1 obj1 = new For_loop1 ();
		System.out.println("==========Print 0 to 10============");
		obj1.m1();
		System.out.println("======================Print 0 to 10 in reverce direction =================");
		obj1.m2();
		System.out.println("======================Print Even no from 1 to 10  =================");
		obj1.m3();
		System.out.println("======================Print Odd no from 1 to 10  =================");
		obj1.m4();


	}
	public void m1 () {

		for (int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
	public void m2 () {

		for (int i=10; i>=0; i--) {
			System.out.println(i);
		}
	}
		public void m3 () {

			for (int i=0; i<=10; i=i+2) {
				System.out.println(i);
			}
		}
		public void m4 () {

			for (int i=1; i<=10; i=i+2) {
				System.out.println(i);
			}
	}
}

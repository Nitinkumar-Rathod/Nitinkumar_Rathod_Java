package Array;

public class sample4 {

	int a = 10;
	int ar2[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } }; // non static array

	public void m1() {

		for (int k = 0; k < ar2.length; k++) {

			for (int s = 0; s < ar2[k].length; s++) {

				System.out.print(ar2[k][s] + " ");
			}
			System.out.println(" ");
		}

	}

	static int ar3[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } }; // static array

	public static void m2() {

		System.out.println("===================================================================");

		for (int k = 0; k < ar3.length; k++) {

			for (int s = 0; s < ar3[k].length; s++) {

				System.out.print(ar3[k][s] + " ");
			}
			System.out.println(" ");
		}
	}

	public void m3() {

		  for (int[] arr:ar2) {
			  
			  for (int value : arr) {
				  
				  System.out.print(value +" ");
			  }
			  System.out.println();
		  }
	}

	public static void main(String[] args) {

		sample4 s1 = new sample4();
		s1.m1();
		m2();
		s1.m3();
		System.out.println(s1.a);
	}

}

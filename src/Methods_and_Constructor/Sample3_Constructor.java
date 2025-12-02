package Methods_and_Constructor;

public class Sample3_Constructor {
	
	 int a;
	
	Sample3_Constructor (){
		a=20;
	}
	
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		Sample3_Constructor s1 =new Sample3_Constructor ();
		s1.m1();
	}
}

package Variables_and_Type;

public class VAriable3 {
	
	int x=0;
	static int y=0;
	
	VAriable3 (){
		 ++x;
		 ++y;
	}
	void m1 () {
		
		System.out.println(x+ " " + y);
	}
	public static void main(String[] args) {
		VAriable3 obj = new VAriable3 ();
		obj.m1();
		VAriable3 obj1 = new VAriable3 ();
		obj1.m1();
		VAriable3 obj2 = new VAriable3 ();
		obj2.m1();
	/*	obj.m1();
		obj1.m1();
		obj2.m1(); */
	}

}

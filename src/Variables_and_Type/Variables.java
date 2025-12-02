package Variables_and_Type;

public class Variables {

	public static void main(String[] args) {

		Variables s1 = new Variables ();

		s1.Approach1();
		System.out.println("===================================================");
		s1.Approach2();
		System.out.println("===================================================");
		s1.Approach3();


	}
	public void Approach1 () {

		int a=20;
		String name ="XYZ";
		char Grade ='A';
		System.out.println("a is equal to :- "+ a);
		System.out.println("name is equal to :- "+ name);
		System.out.println("Grade is equal to :- "+ Grade);

	}

	public void Approach2 () {

		int a,b,c;
		a=20;
		b=30;
		c=40;
		System.out.println("a is equal to :- "+ a);
		System.out.println("b is equal to :- "+ b);
		System.out.println("c is equal to :- "+ c);

	}

	public void Approach3 () {

		int a=20,b=30,c=40;
		System.out.println("a is equal to :- "+ a);
		System.out.println("b is equal to :- "+ b);
		System.out.println("c is equal to :- "+ c);
	}

}

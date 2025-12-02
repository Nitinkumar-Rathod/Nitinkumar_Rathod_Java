package Basic_Java;

public class Constructor2 
{
	String name;
	int Payment;
	
	Constructor2(String Sname , int PackageS){
		
		name=Sname;
		Payment=PackageS;
		System.out.println(Sname);
		System.out.println(PackageS);
	}
	public static void main(String[] args) {
		
		 Constructor2 C2 = new Constructor2 ("Nitinkumar",22);
		 Constructor2 C3 = new Constructor2 ("Nitinkumar",20);
		 Constructor2 C4 = new Constructor2 ("Nitinkumar",18);

		 
	}
}

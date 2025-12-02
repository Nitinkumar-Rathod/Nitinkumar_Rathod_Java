package String;

public class Sample1 {
	
	//Strings immutable isliye banayi gayi kyunki ek hi string object ko multiple variables share kar
	//sakte hain. Agar wo mutable hoti, to ek variable ki change sabko affect kar deti — jo risky hai.

	public static void main(String[] args) {
		
		
		String name = "Nitin";
		String username = name;
		String pass = name;
		
		String name3 = new String ("Nitin");
		String name4 = new String ("Nitin");
		
		System.out.println(System.identityHashCode(name));    // reference check karnya sathi method
		System.out.println(System.identityHashCode(username));
		System.out.println(System.identityHashCode(pass));
		System.out.println(System.identityHashCode(name3));
		System.out.println(System.identityHashCode(name4));
		
		name = "rahul";            // jevnha pn change karayla jaato tevnha jun tasach rahat new vegala create hoto
	System.out.println(name);
	System.out.println(System.identityHashCode(name));
	System.out.println(username);
	System.out.println(pass);
	
	// real time ex:-  For ex we are going to update Aadhar then te will update in and you will get 
	// new aadhar and odl one is still with you as it is.
	
	}
	

}

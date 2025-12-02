package Variables_and_Type;

public class Static_variable_Example {
	
	 int x=0;
	 static int y=0;
	 
	 Static_variable_Example (){
		 
		 x++;
		 y++;
	 }
public void m1 () {
	
	System.out.println(x + " " +y );
}
public static void main(String[] args) {
	
	Static_variable_Example s1 = new Static_variable_Example ();
	s1.m1();
	Static_variable_Example s2 = new Static_variable_Example ();
	s1.m1();
	Static_variable_Example s3 = new Static_variable_Example ();
	s1.m1();
}
}

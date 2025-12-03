package Logical_programs;

public class Star_pattern {
	
	
	public static void main(String[] args) {
		
		Star_solid_rectangular();
	}
	
	public static void Star_solid_rectangular () {
		
		/*

		 * * * * *    print this solid rectangular pattern
		 * * * * * 
		 * * * * * 
		 * * * * *

		 */
		
		int row =4;
		int column = 5;
		
		for (int i=0; i<row;i++) {
			
			for (int j=0; j< column ; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

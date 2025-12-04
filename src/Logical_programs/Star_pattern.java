package Logical_programs;

public class Star_pattern {
	
	
	public static void main(String[] args) {
		
		Star_solid_rectangular();
		star2();
		star3();
		star4();
		star5();
		star6();
	}
	
	public static void Star_solid_rectangular () {
		
		/*

		 * * * * *    print this solid rectangular pattern
		 * * * * * 
		 * * * * * 
		 * * * * *

		 */
		
		int row=4;
		int column = 5;
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<column; j++) {
				
				System.out.print("*"+ " ");   // space chan disav manhun dilel ahe
			}
			System.out.println();
		}
		System.out.println( "=============================================================");
	}
	public static void  star2 () {

		/*

		 * 
		 **
		 ***      print half pyramid
		 ****

		 */
		int row =4;
		int star = 1;    // star available in 1st row
		
		for(int i=1; i<=row ; i++) {
			
			for (int j=1; j<=star ; j++){
				
				System.out.print("*" +" ");
			}
			System.out.println();
			star++;
		}
		System.out.println( "=============================================================");

	}
	
	public static void star3 () {


		/*
		****
        ***
        **
        *     */
		int row =4;
		int star = 4;    // star available in 1st row
		
		for (int i=row; i>=1; i--) {
			
			for (int j=star ; j>=1 ; j--) {
				
				System.out.print("*" + " ");
			}
			System.out.println();
			star--;
		}
		System.out.println(" ==================================================================");
		
	}
	public static void star4 () {

		           /*         
		 *
        **
       ***
      ****      */

		int row = 4;
		int star = 1;
		int space =3;
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=space; j++) {
				
				System.out.print(' ');
			}
			for (int k=1; k<=star ; k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
		
		System.out.println( "======================================================");
		
	}
	public static void star5 () {

		/*
		 ****
          ***
           **
            *
		 */

		int row = 4;
		int star =4;
		int space = 0;

		for(int i=1; i<=row ; i++) {

			for(int j=1; j<=space; j++) {
				System.out.print(' ');
			}
			for(int k=1; k<=star; k++) {

				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		System.out.println("================================================================================");

	}

	public static void star6 () {

		/*
		  *
         ***
        *****
       *******	
		 */
		int row = 4;
		int star = 1;
		int space =3;

		for (int i=1; i<=row ; i++) {

			for(int j=1; j<=space ; j++) {

				System.out.print(' ');
			}
			for(int k=1; k<=star; k++) {

				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}
		System.out.println("================================================================================");

	}
		
		
}

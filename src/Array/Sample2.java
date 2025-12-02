package Array;

public class Sample2 {
	

public static void main(String[] args) {
	
// Matrix form
	String ar1 [] [] = {{"Nitin", "Vaibhav","Vidya" },{"Kajal", "Milind","Harsha"}};

	for (int i=0;i<ar1.length ; i++) {
		                // 0 < 2
		               //  1<2
		
		for (int j=0; j < ar1[i].length  ; j++) {
			
			System.out.print(ar1[i][j] + " ");
		}
		System.out.println(" ");
	}
	
	
	
	
	System.out.println("==============================================================================");
	
	int ar2 [] [] = {{10,20,30},{40,50,60},{70,80,90}};
	
	for (int k=0; k<ar2.length ; k++) {
		
		for (int s=0; s<ar2[k].length;s++) {
			
			System.out.print(ar2[k][s] + " ");
		}
		System.out.println( " ");
	}
	
}

}

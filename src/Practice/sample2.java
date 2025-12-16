package Practice;

public class sample2 {
	
	// Array
	public static void main(String[] args) {
		
	
	int ar1 [] [] ={{1,2,3,4},{1,2,3,4}};
	
	//1,2,3,4
	//1,2,3,4
	for (int i=0; i<=ar1.length-1 ; i++)   // row
	{
		for (int a=0; a<=ar1[i].length-1 ; a++)  //coln
		{
			System.out.print(ar1[i][a]);
		}
		System.out.println(" ");
	}
	}

}

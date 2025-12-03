package Logical_programs;

import java.util.Arrays;

public class ArrayLogicalprograms {

	int ar1[] = { 10, 20, 30, 1, 8, 48, 25, 11 };

	public static void main(String[] args) {

		ArrayLogicalprograms obj = new ArrayLogicalprograms();

		obj.Array_Even_odd();
		System.out.println( " =====================================================");
		obj.Largest_value();
		System.out.println( " =====================================================");
		obj.Largest_value2nd();
		System.out.println( " =====================================================");
		obj.Largest_value3rd();
		System.out.println( " =====================================================");
		obj.second_Largest_value();
		System.out.println( " =====================================================");
		obj.second_Largest_value2nd();
		System.out.println( " =====================================================");
		obj.startsWithCount();
		System.out.println( " =====================================================");



	}

	public void Array_Even_odd() {
		int Even_count = 0;
		int Odd_count = 0;
		for (int i = 0; i < ar1.length; i++) {

			if (ar1[i] % 2 == 0) {
				System.out.println(ar1[i] + " is even number ");
				Even_count++;
			} else {

				System.out.println(ar1[i] + " is Odd number ");
				Odd_count++;
			}
		}
		System.out.println("Total Even number count is = " + Even_count);

		System.out.println("Total Odd number count is = " + Odd_count);
	}
	// Find largest value from given array
	
	public void Largest_value() {
		
		int largest = ar1[0];
		
		for (int i=0; i<ar1.length;i++)  {
			
			if(ar1[i] >= largest ) {
				largest = ar1[i];
			}
		}
		System.out.println("The largest value from given array is :- " + largest);
	}
	
	// 2nd way
	
public void Largest_value2nd() {
		
		int largest = ar1[0];
		
		for (int arr:ar1)  {
			
			if(arr >= largest ) {
				largest = arr;
			}
		}
		System.out.println("The largest value from given array is :- " + largest);
	}
	
	// 3rd way

public void Largest_value3rd() {
	
	System.out.println("The largest value from given array is :-" + Arrays.stream(ar1).max().getAsInt());
}

// Find Second largest value from given array

public void second_Largest_value() {
  
int ar1 [] = {10,50,44,55,18,22,77};
	
	int largest =Integer.MIN_VALUE;   // Min_value means it is a minimum value which int can accept. i.e -21....
	int secondlargest =Integer.MIN_VALUE;
	
	for(int arr:ar1){
	 
	  if (arr >  largest){
	  secondlargest = largest ;
	  largest = arr;
	  }
	  else if ( arr > secondlargest && arr < largest ){
	  
	      secondlargest = arr;
	  }
	}
   System.out.println("Second largest value is  :- " + secondlargest);

}
	/*
	----------------------------------------------------------------------------------------------------
	| Iteration |  arr  |               Condition Checked                    |     Action Taken       | largest | secondlargest |
	----------------------------------------------------------------------------------------------------
	|     1     |  10   | 10 > -∞  (true)                                    | secondlargest = -∞     |   10    |      -∞       |
	|           |       |                                                   | largest = 10           |         |               |
	----------------------------------------------------------------------------------------------------
	|     2     |  50   | 50 > 10 (true)                                     | secondlargest = 10     |   50    |      10       |
	|           |       |                                                   | largest = 50           |         |               |
	----------------------------------------------------------------------------------------------------
	|     3     |  44   | 44 > 50 (false)                                    | secondlargest = 44     |   50    |      44       |
	|           |       | 44 > 10 && 44 < 50 (true)                         |                        |         |               |
	----------------------------------------------------------------------------------------------------
	|     4     |  55   | 55 > 50 (true)                                     | secondlargest = 50     |   55    |      50       |
	|           |       |                                                   | largest = 55           |         |               |
	----------------------------------------------------------------------------------------------------
	|     5     |  18   | 18 > 55 (false)                                    | No change              |   55    |      50       |
	|           |       | 18 > 50 && 18 < 55 (false)                        |                        |         |               |
	----------------------------------------------------------------------------------------------------
	|     6     |  22   | 22 > 55 (false)                                    | No change              |   55    |      50       |
	|           |       | 22 > 50 && 22 < 55 (false)                        |                        |         |               |
	----------------------------------------------------------------------------------------------------
	|     7     |  77   | 77 > 55 (true)                                     | secondlargest = 55     |   77    |      55       |
	|           |       |                                                   | largest = 77           |         |               |
	----------------------------------------------------------------------------------------------------
	*/


//2nd way
public void second_Largest_value2nd () {

System.out.println("The Second largest value from given array is :-" + Arrays.stream(ar1).boxed().sorted((a, b) -> b - a).skip(1).findFirst().get());

}
	
public void startsWithCount () {
	
    int count =0;
		String ar1[] = { "Nitin", "Anil", "Ashvin", "Avyan" };

		// find the count of name starts with A
	for(String arr:ar1)	{
		if (arr.startsWith("A")) {
			System.out.println(arr);
			count++;
		}
	}
	System.out.println("The count of name starts with A is :- " +count);
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

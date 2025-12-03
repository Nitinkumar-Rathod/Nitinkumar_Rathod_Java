package Collection;

import java.util.ArrayList;

public class Arraylist_list {
	
	public static void main ( String [] args ){
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

}
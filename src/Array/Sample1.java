package Array;

import java.util.Arrays;

public class Sample1 {
	 // We can convert any type of arrany to string
	
		public static void main(String[] args) {

			String ar1 [] = {"Nitin", "Vaibhav", "Milind"};		
			String ar2 [] = {"Nitin", "Vaibhav", "Milind"};	
			int ar3 [] = {1,2,3};
			char ar4 [] = {'c','d','o'};
			short ar7 [] = {10,20};
			boolean ar9 [] = {true,false};
			double ar11 [] = {10.40,20.40};


			int arr=ar1.length;   // properties

			System.out.println(arr);

			boolean n=Arrays.equals(ar1, ar2);

			System.out.println(n);
			
			String ar5 = Arrays.toString(ar3);
			
			String ar6 = Arrays.toString(ar4);
			String ar8 = Arrays.toString(ar7);
			String ar10 = Arrays.toString(ar9);
			String ar12 = Arrays.toString(ar11);
			
			System.out.println(ar5);
			System.out.println(ar6);
			System.out.println(ar8);
			System.out.println(ar10);
			System.out.println(ar12);
		}

}

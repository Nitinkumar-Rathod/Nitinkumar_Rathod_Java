package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class sample1 {
	
	public static void main(String[] args) {
        int count =0;
		String ar1[] = { "Nitin", "Anil", "Ashvin", "Avyan" };

		// find the count of name starts with A
	for(String arr:ar1)	{
		if (arr.startsWith("A")) {
			System.out.println(arr);
			count++;
		}
	}
	System.out.println("The count of name starts with A is" +count);
	}
}

package String;

public class Sample3 {

	public static void main(String[] args) {

		Sample3 obj = new Sample3();
		obj.startsWith();
		obj.reverseString();
		obj.palindrome();
		obj.stringtochar();

	}

	public void startsWith() {

		String name[] = { "Nitin", "Ashvin", "Nikita", "Rathod", "Anil", "Sumit" };

		for (String arr : name) {

			if (arr.startsWith("A")) {

				System.out.println(arr);
			}
		}
		System.out.println("========================================================");

	}

	public void reverseString() {
		
		String name = "Nitin";
		String reversename = "";
        for (int i=name.length()-1 ; i>=0 ; i--) {
        	
        	reversename = reversename + name.charAt(i);
        }
        System.out.println(reversename);
        
		System.out.println("========================================================");
	}
	
	public void palindrome () {
		
		String name = "NITIN";
		String reversename = "";
        for (int i=name.length()-1 ; i>=0 ; i--) {
        	
        	reversename = reversename + name.charAt(i);
        }
        if (reversename .equals(name) ) {
        	
        	System.out.println(" Name is a Palindrome String");
        }
        else {
        	
        	System.out.println(" Name is not a Palindrome String");

        }
		System.out.println("========================================================");

	}
	
	public void stringtochar () {
		
		String name = "Nitin";
		
		char ar1 [] =name.toCharArray();
		
		for (char arr:ar1) {
			
			if (arr == 't') {
				
				System.out.println(arr);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

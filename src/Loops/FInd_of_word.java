package Loops;

public class FInd_of_word {
public static void main(String[] args) {
	
	//find the count of words in the given statement.
	
			String Name = "I Love My Country";
			int count =1;
			for (int  i=0; i<=Name.length()-1; i++) {
				
				char current_value =Name.charAt(i);
			
				
			   if ( current_value == ' ') {
				
				count++;}
			}
	
			System.out.println("No Of words in the given Sentence is  equals to :-" +count);

}

}

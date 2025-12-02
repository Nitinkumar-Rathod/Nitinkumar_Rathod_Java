package Logical_programs;

public class String_logical_program {

	public static void main(String[] args) {

		String_logical_program obj = new String_logical_program();
		obj.remove_space();
		System.out.println("===============================================================");
		obj.spaceCount();
		System.out.println("===============================================================");
		obj.word_countFromString();
		System.out.println("===============================================================");
		obj.reverseString();
		System.out.println("===============================================================");
		obj.reverseStringsecondway();
		System.out.println("===============================================================");
		obj.reverseStringthirdway();
		System.out.println("===============================================================");
		obj.countCharactor("This is a very simple Sentence");
		System.out.println("===============================================================");
		obj.countvowelsandconsonent();
		System.out.println("===============================================================");
		obj.pallandrome();
		System.out.println("===============================================================");
		obj.reverseSentence();
		System.out.println("===============================================================");




	}

	public void remove_space() {

		String text = "Nitin rathod i s a sr  QA En gineer";

		String new_text = text.replaceAll("\\s+", "");
		System.out.println(new_text);

	}

	public void spaceCount() {

		String text = "Nit in rathod i s a sr  QA En gineer";
		int count = 0;
		for (int i = 0; i <= text.length() - 1; i++) {

			char value = text.charAt(i);

			if (value == ' ') {

				count++;
			}
		}

		System.out.println("Total count of space in Given String is :- " + count);

	}

	public void word_countFromString() {
		int count = 1;
		String text = "Nitin Rathod is a Sr QA Engineer";

		for (int i = 0; i <= text.length() - 1; i++) {

			char value = text.charAt(i);

			if (value == ' ') {
				count++;
			}
		}
		System.out.println("Total count of Words in Given String is :- " + count);

	}

	public void reverseString() {

		String name = "Nitinkumar";
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);
		}
		System.out.println("Reverse value of Given string is :- " + reverse);
	}

	// second way
	public void reverseStringsecondway() {

		String name = "Nitinkumar";
		String rev = "";
		char newname[] = name.toCharArray();

		for (int i = newname.length - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse value of Given string is :- " + rev);
	}

	public void reverseStringthirdway() {

		String name = "Nitinkumar";
		StringBuilder s1 = new StringBuilder();
		System.out.println("Reverse value of Given string is :- " + s1.append(name).reverse());

	}
	
	public void countCharactor(String name) {

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if( name.charAt(i)!= ' ') {

			count++;
		}
	}
		System.out.println("Total charactor count in given String is " + count);

		}
	
	public void countvowelsandconsonent(){
		
		 String s1="This is a really simple sentence";
	        s1=s1.toLowerCase();
	        int vcount=0;
	        int ccount=0;

	        for(int i=0;i<s1.length(); i++){

	            if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
	                vcount++;
	            }
	            else if(s1.charAt(i)>= 'a' && s1.charAt(i)<='z'){
	                ccount++;
	            }

	        }

	        System.out.println("vowel cout ="+vcount +" and consenent count ="+ ccount);
	    }
	 public  void pallandrome(){
	        String org="NITIN";
	        String rev="";

	        for (int i=org.length()-1;i>=0;i--){
	            rev=rev+org.charAt(i);
	        }
	        if(org.equals(rev))
	            System.out.println("given string is pallandrome");

	        else
	            System.out.println("given string is  not pallandrome");
	    }

	 public void reverseSentence() {
	        String org="Best of luck";
	        String rev ="";
	        String s1 [] =org.split(" ");
	        for (int i=s1.length-1 ; i>=0; i--) {
	        	
	        	rev=rev+" "+s1[i];
	        }
            System.out.println(rev);
	 }
	 
}

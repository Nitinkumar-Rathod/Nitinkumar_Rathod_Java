package Logical_programs;

public class String_logical_program {

	public static void main(String[] args) {

		String_logical_program obj = new String_logical_program();
		obj.remove_space();
		System.out.println("===============================================================");
		obj.spaceCount();
		System.out.println("===============================================================");
		spaceCountSecondway();
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
		palindromesecondway ();
		System.out.println("===============================================================");
		obj.reverseSentence();
		System.out.println("===============================================================");
		obj.uppercase_lowercase_count();
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
public static void spaceCountSecondway() { 
		
		// count the space from the given string
		
		String name = "n n Hd y h  s TR";
		int count = 0;
        char ar1[]= name.toCharArray();
        
        for (char arr:ar1) {
        	if(arr == ' ') {
        		count++;
        	}
        }
        System.out.println(count);
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

			if (name.charAt(i) != ' ') {

				count++;
			}
		}
		System.out.println("Total charactor count in given String is " + count);

	}

	public void countvowelsandconsonent() {

		String s1 = "This is a really simple sentence";
		s1 = s1.toLowerCase();
		int vcount = 0;
		int ccount = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vcount++;
			} else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				ccount++;
			}

		}

		System.out.println("vowel cout =" + vcount + " and consenent count =" + ccount);
	}

	public void pallandrome() {
		String org = "NITIN";
		String rev = "";

		for (int i = org.length() - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);
		}
		if (org.equals(rev))
			System.out.println("given string is pallandrome");

		else
			System.out.println("given string is  not pallandrome");
	}
	public static void palindromesecondway() { 
		// CHECK THE GIVEN sTRING IS PALINDROME OR NOT
		String name = "NITIN";
		
		StringBuilder str = new StringBuilder ();
		StringBuilder rev=str.append(name).reverse();
		
		if (rev.toString().equals(name)) {  //StringBuilder.equals() object reference compare karta hai, content compare nahi karta. manhun tostring use kel
			
			System.out.println("The given String is a palindrome");
		}
		else {
			System.out.println("The given String is not a palindrome");

		}
	}

	public void reverseSentence() {
		String org = "Best of luck";
		String rev = "";
		String s1[] = org.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {

			rev = rev + " " + s1[i];
		}
		System.out.println(rev);
	}

	public void uppercase_lowercase_count() {

		String text = "hJHGjhdJHJhdnbdGJfGrJ";
		int upper = 0;
		int lower = 0;

		for (int i = 0; i < text.length(); i++) {

			char charvalue = text.charAt(i);
			if (Character.isUpperCase(charvalue)) {
				upper++;
			} else if (Character.isLowerCase(charvalue)) {
				lower++;
			}
		}
		System.out.println("Total upper case char count is :-" + upper);
		System.out.println("Total lower case char count is :-" + lower);
	}
}

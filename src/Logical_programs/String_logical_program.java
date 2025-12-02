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
		obj.countCharactor("aSHVINnkumar");
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

		for (int i = 0; i <= name.length() - 1; i++) {

			char newname = name.charAt(i);

			count++;
		}
		System.out.println("Total charactor count in given String is " + count);
	}
}

package Logical_programs;

import Practice.sample1;

public class Some_common_program {

	public static void main(String[] args) {

		Fibonaki_serice();
		Amstrong_number();
		Largestnumber();
		Largestnumber2ndway();
		way();
	}

	public static void Fibonaki_serice () {

		int sum=0;

		for (int i=0; i<=10; i++) {

			sum=sum + i;
		}
		System.out.println(sum);
	}
	public static void Amstrong_number () {

		int number = 153;
		int sum=0;

		for (int i=number;i>0; i= i/10) {

			int rem = i%10;

			sum=sum+(rem*rem*rem);
		}
		//System.out.println(sum);
		if(number==sum) {
			System.out.println("The given number is Amstrong number");
		}else {
			System.out.println("The given number is not an Amstrong number");

		}
	}
	public static void Largestnumber () {

		int a = 10;
		int b = 20;

		int largest = Math.max(a, b);
		System.out.println(largest);

	}
	public static void Largestnumber2ndway () {

		int a = 10;
		int b = 20;

		int largest = (a > b) ? a : b;
		System.out.println(largest);

	}
	public static void way () {

		String Name = "NitinKumar";
		int ucount=0;
		int lcount=0;
		for (int i=0; i<=Name.length()-1; i++) {

			char a=Name.charAt(i);
			if(Character.isUpperCase(a)) {
				ucount++;
			}else {
				lcount++;
			}
		}
		System.out.println(ucount);
		System.out.println(lcount);
	}

}

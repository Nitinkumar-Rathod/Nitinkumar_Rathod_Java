package Logical_programs;

import Practice.sample1;

public class Some_common_program {
	
	public static void main(String[] args) {
		
		Fibonaki_serice();
		Amstrong_number();
	}
	
	public static void Fibonaki_serice () {
		
		int sum=0;
		
		for (int i=0; i<=10; i++) {
			
			sum=sum + i;
		}
		System.out.println(sum);
	}
public static void Amstrong_number () {
		
	int number = 13;
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
		
		
		
		
		
		

}

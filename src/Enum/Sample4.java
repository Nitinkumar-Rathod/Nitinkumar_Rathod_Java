package Enum;

public class Sample4 {

	static int TotalIncome = 65090 ;  // Guys Amount aani mazya salary cha kahihi sambandh nahi..
	
	public static void main(String[] args) {
		
		Totalkharch();
	}
	public static void Totalkharch () {
		
		int a= Sample3.TotalKharch.AXIS_EMI.getTotalKharch();
		int b= Sample3.TotalKharch.CARD.getTotalKharch();
		int c= Sample3.TotalKharch.SIP.getTotalKharch();
		
		int kharch = (a+b+c);
		
		System.out.println("Total Kharch = " + kharch );
		
		System.out.println("Balance amount = " + (TotalIncome-kharch));
	}
}

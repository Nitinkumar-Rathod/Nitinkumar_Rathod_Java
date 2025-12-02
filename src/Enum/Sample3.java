package Enum;

public class Sample3 {
	
	
	public static enum TotalKharch {
		
		AXIS_EMI (9696),
		CARD     (15000),
		SIP     (3000);
		
		
		
		private int kharch;
		
		TotalKharch (int kharch){
			
			this.kharch=kharch;
		}
		public int getTotalKharch () {
			return kharch;
		}
	}

}

package Practice;

public class Enumration {
	
	public static enum MONTH  {
		
		JANUWARY ("JANUWARY"),
		FEBRUARI ("FEBRUARI");
		
		private String monthname;

	MONTH (String monthname){
		
		this.monthname=monthname;
	}
	public static  String getmonthname (String monthname) {
		
		return  monthname;
	}
	}
}

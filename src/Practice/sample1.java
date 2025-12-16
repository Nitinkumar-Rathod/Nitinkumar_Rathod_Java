package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class sample1 {
	
	  public static enum Browser{


		ORANGEHRM  ("ORANGEHRMCHIURL");

		private String url;

		Browser (String url){
		  this.url = url;
		}
		public  String geturl (){

		     return url;
		}
		 }
	  
}

package Enum;


public class Enum_1 {
	
	enum month {
		January ("First Month of the year") , 
	 
		December ("Last Month of the year");
		
		private String comment ;
		
		month (String comment){
			
			this .comment= comment;
		}
		
		public String getcomment () {
			
			return comment;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(month.January.getcomment());
		
		System.out.println(Enum_Moviename.Movie_name.MAI_HUN_NA.getMoviename());
	}
	

}

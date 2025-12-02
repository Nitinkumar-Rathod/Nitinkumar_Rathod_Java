package Enum;

public class Enum_Moviename {
	
	public static enum Movie_name{
		
		MAI_HUN_NA("MAI_HUN_NA Movie by shahrukh khan");
		
		
		private String name;
		
		Movie_name (String name){
			this.name=name;
		}
		public String getMoviename() {
			return name;
		}
	}

}

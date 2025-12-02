package String;

public class Sample2 {
	
	public static void main(String[] args) {
		
	    String Name = "Nitin";
	    
	    System.out.println(Name.length());      // length
	    System.out.println(Name.isEmpty());      
	    System.out.println(Name.isBlank());      
	    System.out.println(Name.toUpperCase());      
	    System.out.println(Name.toLowerCase());  
	    System.out.println(Name.equals("Nitin"));  
	    System.out.println(Name.equalsIgnoreCase("Nitin"));  
	    System.out.println(Name.contains("N"));  
	    System.out.println(Name.charAt(0));  
	    System.out.println(Name.startsWith("N"));  
	    System.out.println(Name.endsWith("N"));  
	    System.out.println(Name.indexOf("N"));  
	    System.out.println(Name.lastIndexOf("n"));  
	    System.out.println(Name.substring(3));  
	    System.out.println(Name.substring(1,3));  
	    System.out.println(Name.replace("Nitin", "Ashvin"));  
	    System.out.println(Name.concat("name"));  
	    

	}

	    
}

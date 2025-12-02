package Enum;

public class Enumration {
	
	
	public static enum  Environment {
		
		QA("https://qa.app.com"),
	    STAGING("https://staging.app.com"),
	    PROD("https://prod.app.com");

	    public String url;

	    Environment(String url) {
	        this.url = url;
	}
	}
}

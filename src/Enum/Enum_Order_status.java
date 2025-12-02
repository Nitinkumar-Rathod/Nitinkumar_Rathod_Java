package Enum;

public class Enum_Order_status {
	
	enum order_Status {
		
		New ("New"),
		AcknowLedge("AcknowLedge"),
        Modify("Modify"),
        Shipped("Shipped"),
        Received("Received");
		
		private String status ;
		
		order_Status (String status){
			
			this.status=status;
		}
		public String getStatus () {
			
			return status;
		}
		
		
	}
public static void main(String[] args) {
	
	System.out.println(order_Status.New.getStatus());
}
}

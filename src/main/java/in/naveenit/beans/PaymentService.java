package in.naveenit.beans;

public class PaymentService {
	
	
	
	 private IPayment  payment;
	 
	 
	 
	   public PaymentService(IPayment payment) {
		
		this.payment = payment;
	}
	   



	public void doPayment(double  billAmt) {
		   
		    boolean  status = payment.processPayment(  billAmt);
		    	 if (status) {
		    		 System.out.println( " bill generated Sucessfully");
		    } else {
		    	System.out.println("   Card invalid  Creditails" );
		    }
	   }

}

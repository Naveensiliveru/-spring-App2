package in.naveenit.beans;

public class Credit implements IPayment {

	public boolean processPayment(double billAmt) {
	System.out.println("CreditCard Payment is Sucessful");
		return  true;
	}

}

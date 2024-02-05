package in.naveenit.beans;

public class DebitCardPayment implements  IPayment  {

	public boolean processPayment(double billAmt) {
		System.out.println(" DebitCard Payment is sucessful");
		return  true;
	}

}

package ist242;

public class Cash extends Payment{

	public Cash(double payCharge){
	super(payCharge);
	}
	
	public double handlePayment(double pay){
	return pay * super.getpaymentCharge();
	}
	
}
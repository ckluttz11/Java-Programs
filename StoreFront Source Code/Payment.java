package ist242;

abstract class Payment{

	private double paymentCharge;
	
	public Payment(double payCharge){
	paymentCharge = payCharge;
	}

	public double getpaymentCharge(){
	return paymentCharge;
	}

	public abstract double handlePayment(double pay);

}
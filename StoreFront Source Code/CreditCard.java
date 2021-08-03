package ist242;

import java.util.*;
import java.util.Date;

public class CreditCard extends Payment{

	private String cardHolderName;
	private int cardNumber;
	private Date cardExpDate;

	public CreditCard(double payCharge){
	super(payCharge);
	}
	
	public double handlePayment(double pay){
	return pay * super.getpaymentCharge();
	}

	public void setCreditCardExpDate(){
	cardExpDate = new Date();
	}

	public Date getCreditCardExpDate(){
	return cardExpDate;
	}

	public void setCardHolderName(String cardName){
	cardHolderName = cardName;
	}

	public String getCardHolderName(){
	return cardHolderName;
	}
	
	public void setCardNumber(int cardNum){
	cardNumber = cardNum;
	}

	public int getCardNumber(){
	return cardNumber;
	}
	
	
	public void promptUserCard(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name");
	cardHolderName = scan.nextLine();
	scan.nextLine();
	System.out.println("Enter Card Number");
	cardNumber = scan.nextInt();
	}
	
	
}

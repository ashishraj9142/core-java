package com.interFaces.lab;

import java.util.Scanner;

interface Payment{
	public void processPayment();
	public void applyDiscount();
}

class CreditCardPayment implements Payment{

	@Override
	public void processPayment() {
		System.out.println("Initiating Credit Card payment");
		System.out.println("Processing Credit Card payment...");		
	}
	@Override
	public void applyDiscount() {
		System.out.println("Applying 10% discount for Credit Card payment");	
	}
	
}






class UPIPayment implements Payment{

	@Override
	public void processPayment() {
		System.out.println("Initiating UPI payment");
		System.out.println("Processing UPI payment...");
	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying 5% discount for UPI payment");
	}
	
}




class PaymentGateWay{
	public Payment initiatePayment(String paymentType) {
		if(paymentType.equalsIgnoreCase("credit")) {
			return new CreditCardPayment();
		}
		else if(paymentType.equalsIgnoreCase("debit")) {
			return new UPIPayment();
		}
		else return null;
	}
}




public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PaymentGateWay payment = new PaymentGateWay();
		System.out.println("Credit card /n UPI");
		String choice = sc.nextLine();
		switch(choice) {
		case "credit" :{
			Payment p1 = payment.initiatePayment("credit");
		    p1.processPayment();
		    p1.applyDiscount();
		    break;
		}
		case "UPI" :{
			Payment p1 = payment.initiatePayment("upi");
			p1.processPayment();
			p1.applyDiscount();
			break;
		}
		default : {
			System.out.println("Invalid payment type selected!");
		}
		
		}
		
		
  sc.close();
	}

}

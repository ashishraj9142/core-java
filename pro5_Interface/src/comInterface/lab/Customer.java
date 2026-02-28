package comInterface.lab;

import java.util.Scanner;

sealed interface Payment{
	void makePayment (double amount);
	void makeRefund(double amount);
}
non-sealed class CreditCardPayment implements Payment{
	private String cardHolderName;
	
	public CreditCardPayment(String cardHolderName) {
		super();
		this.cardHolderName=cardHolderName;
	}
	public void makePayment(double amount) {
		System.out.println("");
	}
	public void makeRefund(double amount) {
		
	}
}

non-sealed class DebitCardPayment implements Payment {
	private String bankName;
	public DebitCardPayment(String bankName) {
		super();
		this.bankName=bankName;
	}
	
	public void makePayment(double amount) {
		
	}
	public void makeRefund(double amount) {
		
	}
}

non-sealed class UPIPayment implements Payment{
	private String upiId;
	
	public UPIPayment(String upiId) {
		super();
		this.upiId=upiId;
	}
	public void makePayment(double amount) {
		
	}
	public void makeRefund(double amount) {
		
	}
}

class ShoppingCart{
	private double totalAmount;
	
	public ShoppingCart(double totalAmount) {
		super();
		this.totalAmount=totalAmount;
	}
	public void checkOut(Payment pay) {
		pay.makePayment(totalAmount);
		System.out.println("Starting checkout for amount RS :"+totalAmount);
	}
	public void cancleOrder(Payment pay) {
		pay.makeRefund(totalAmount);
		System.out.println("Cancelling order for amount RS :"+totalAmount);
	}
}


public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total bill amount: ");
		double amount = sc.nextDouble();
		sc.nextLine();
		
		ShoppingCart cart = new ShoppingCart(amount);
        System.out.println("Select payment Method \n 1. Credit Card \n 2.Debit Card \n 3. UPI ");
       
        int choice = sc.nextInt();
        sc.nextLine();
        Payment payment = null;
        switch(choice) {
        case 1:
            System.out.print("Enter Card Holder Name: ");
            String name = sc.nextLine();
            payment = new CreditCardPayment(name);
            break;
                
        case 2:
            System.out.print("Enter Bank Name: ");
            String bank = sc.nextLine();
            payment = new DebitCardPayment(bank);
            break;

        case 3:
            System.out.print("Enter UPI ID: ");
            String upi = sc.nextLine();
            payment = new UPIPayment(upi);
            break;

        default:
            System.out.println("Invalid option");
            return;
        }
        
  

        sc.close();
	}

}

package elc;

import java.util.Scanner;

import blc.BankOfIndia;
import blc.PunjabNationalBank;

public class PnbCustomer {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
     PunjabNationalBank Customer = new PunjabNationalBank();
	 System.out.println("===== Welcome to " + BankOfIndia.bankname + " =====");
	 System.out.println("Enter Customer Name");
	 String name =sc.nextLine();
	 
	 System.out.println("Enter Account Number");
     int accountNum = Integer.parseInt(sc.nextLine());
     
     System.out.println("Enter Opening Balance");
     double openingBalance = Double.parseDouble(sc.nextLine());
     
    
     Customer.setCustomerDeatils(name, accountNum, openingBalance);
 	while(true) {
	System.out.println("\\n===== MENU =====");
	System.out.println("1. Deposit");
	System.out.println("2. Withdraw");
	System.out.println("3. CheckBalance");
	System.out.println("4. Display Customer Details");
	System.out.println("5. Exit");
	System.out.println("Enter your Choice");
	int choice = sc.nextInt();
	switch(choice) {
	case 1 :
		System.out.println("Enter Deposit Amount ");
		double depositeAmount = sc.nextDouble();
		Customer.depositAmount(depositeAmount);
		break;
		
	case 2 :
		System.out.println("Enter Your Withdraw Amount");
		double withdrawAmount = sc.nextDouble();
		Customer.withdraw(withdrawAmount);
		break;
	case 3 :
		System.out.println("Customer Balance");
	}
 	}
    
     
	}

     

}
package elc;

import java.util.Scanner;

import blc.BankOfIndia;

public class BankCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    BankOfIndia Customer = new BankOfIndia();
		
		 System.out.println("===== Welcome to " + BankOfIndia.bankname + " =====");
		
		System.out.println("Enter Customer Name : ");
        String name = sc.nextLine();
        
        System.out.println("Enter Account Number");
        int accountNum = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter Opening Balance");
        double openingBalance = Double.parseDouble(sc.nextLine());
        
       
        Customer.setCustomerDeatils(name, accountNum, openingBalance);
        
       while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Customer Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt(); 
            
            switch(choice) {
       case 1 : 
            System.out.print("Enter Deposit Amount: ");
            double depositAmount = sc.nextDouble();
            Customer.depositAmount(depositAmount);
            break;
       case 2 : 
            	System.out.println("Enter Your Withdraw Amount");
            double withdrawAmount = sc.nextDouble();
            Customer.withdraw(withdrawAmount);
            break;
       case 3 :
    	        System.out.println("Current Balance :"+Customer.getCureentBalance());
            break;    
       case 4 :
    	        System.out.println("Customer Detais :"+Customer.displayDetails());
            break;
       case 5 :
    	        System.out.println("Thank you for banking with " + BankOfIndia.bankname );
            System.exit(0);
            break;
            
       default:
            System.out.println("Invalid choice! Please try again.");
           
            sc.close();
            }
        }
	}

}

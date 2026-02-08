package blc;

public class PunjabNationalBank {
private String customerName;
private int accountNumber;
private double currentBalance;
public static String bankName = "PNB";
public static String bankAddress = "Bihar";
public static String bankIFSCCode = "PUNB1035";
public void setCustomerDeatils(String name, int account,double balance) {
	if (balance<0) {
System.err.println("negative OR zero");
System.exit(0);
	}
 this.customerName =name;
 this.accountNumber = account;
 this.currentBalance = balance; 
  }
//Withdraw Method
public void withdraw(double withdrawAmount) {
	if(currentBalance>withdrawAmount) {
		  System.err.println("You have insufficient balance!");
		  System.exit(0);
	}
	  currentBalance = (currentBalance-withdrawAmount);
	  System.out.println("After Withdraw Amount :"+currentBalance);
	  System.out.println("Withdrawal successful  "+withdrawAmount);
}
//Deposit Method
public void depositAmount(double depoAmount) {
	if(depoAmount>0) {
		  System.err.println("deposit zero or -ve amount not valid : ");
		  System.exit(0);
	}
	  currentBalance = (currentBalance + depoAmount);
	  System.out.println("Current Balance is After Deposit : "+currentBalance);
	  System.out.println("Deposit successful "+depoAmount);
	  System.out.println("Deposit amount should be greater than zero!");
  }
//Check Balance
public double getCureentBalance() {
	  return currentBalance; 
	  
    }

//CustomerDetails
 public String displayDetails() {
		return "BankOfIndia [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
				+ currentBalance + "]";
 }
       }






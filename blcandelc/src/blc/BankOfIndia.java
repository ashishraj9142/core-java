package blc;

public class BankOfIndia {
private String customerName;
private int accountNumber;
private double currentBalance;
public static String bankname = "SBI";
public static String bankAddress = "Daudpur";
public static String bankIFSCCode = "6555SB";
public void setCustomerDeatils(String name,int accnumber,double balance ) {
	if (balance<0) {
System.err.println("negative OR zero");
System.exit(0);
	}
customerName = name;
accountNumber = accnumber;
currentBalance = balance;
}


//Withdraw Method
public void withdraw(double withdrwAmount) {

		
	  if(withdrwAmount>currentBalance) {
		  System.err.println("You have insufficient balance!");
		  System.exit(0);      
	  }
	  currentBalance = (currentBalance-withdrwAmount);
	  System.out.println("After Withdraw Amount :"+currentBalance);
	  System.out.println("Withdrawal successful  "+withdrwAmount);
	   }


//Deposit Method
  public void depositAmount(double depoAmount) {
	  if(depoAmount<=0) {
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
  
 //Customer Details 
public String displayDetails() {
	return "BankOfIndia [customerName=" + customerName + ", accountNumber=" + accountNumber + ", currentBalance="
			+ currentBalance + "]";
}
     }

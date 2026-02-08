package copyConstructorCustomer;
import java.util.Scanner;
public class InterestCalculatorApp {
  public static void main(String []args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your Name :");
   String  name = sc.nextLine();
   
   System.out.println("Enter your Principal :");
   double amount =Double.parseDouble(sc.nextLine());
   
   System.out.println("Enter time in month :");
   int month = Integer.parseInt(sc.nextLine());
   
   Customer c1 = new Customer(name, amount, month);
   InterestDetails c4 = CalculateInterest.calculateInterest(c1);
   System.out.println(c4);
   sc.close();
  }
}

class Customer{
   private String name;
   private double principal;
   private int timeInMonth;
   public Customer(String name,double principal,int timeInMonth) {
	this.name = name;
	this.principal=principal;
	this.timeInMonth=timeInMonth;
   }
   public String getName() {
   return name;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public double getPrincipal() {
	   return principal;
   }
   public void setPrincipal(double principal) {
	   this.principal = principal;
   }
   public int getTimeInMonth() {
	   return timeInMonth;
   }
   public void setTimeInMonth(int timeInMonth) {
	   this.timeInMonth = timeInMonth;
   }
   public String toString() {
	   return ("Name :" +name);
   }
}
class InterestDetails{
	private Customer customer;
	private double interestRate;
	private double interestEarned;
	private double finalAmount;
	public InterestDetails(Customer customer,double interestRate,double interestEarned,double finalAmount) {
	this.customer = customer;
	this.interestRate = interestRate;
	this.interestEarned= interestEarned;
	this.finalAmount = finalAmount;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate= interestRate;
	}
	public double getInterestEarned() {
		return interestEarned;
	}
	public void setInterestEarned(double interestEarned) {
		this.interestEarned = interestEarned;
	}
	public double getFinalAmount() {
	    return  finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount=finalAmount;
	}
	
	
	public String toString() {
		return (customer+ "\n"+ "Principal Amount"+customer.getPrincipal()+ "\n"+ "Time (months)"+customer.getTimeInMonth()+"\n"+"Applied Interest Rate: "+interestRate+"\n"+"Interest Earned :"+interestEarned+"\n"+"Final Amount after Interest:"
				   +finalAmount);
	}
}
class CalculateInterest{
	public static InterestDetails calculateInterest(Customer customer) {
		double rate = 0;
		int time = customer.getTimeInMonth();
		if(time > 12) {
		rate = 12;
		}
		else if (time>=6) {
			rate = 11;
		}
		else if(time >=3){
			rate = 10;
		}
		else {
			rate = 9;
		}
        double interest = (customer.getPrincipal() * rate * customer.getTimeInMonth()) / (12 * 100);
        double finalAmount = customer.getPrincipal() + interest;
        return new InterestDetails( customer , rate, interest, finalAmount);
	}	
}


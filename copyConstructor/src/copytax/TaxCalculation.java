package copytax;

import java.util.Scanner;

public class TaxCalculation {

	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      TaxUtil e2 = new TaxUtil();
      System.out.println("Enter Employee Id");
      int id = Integer.parseInt(sc.nextLine());
      
      System.out.println("Enter Employee Name :");
      String name = sc.nextLine();
      
      System.out.println("Enter Employee Basic Salary :");
      double basicSalary=Double.parseDouble(sc.nextLine());
      
      System.out.println("Enter HRAper :");
      double HRAper = Double.parseDouble(sc.nextLine());
      
      System.out.println("Enter DAper");
      double DAper = Double.parseDouble(sc.nextLine());
      Employee e1 = new Employee (id,name,basicSalary,HRAper,DAper);
      System.out.println("Employee :"+e2.calculateTax(e1));
      
      System.out.println("Enter Id");
      int idm = Integer.parseInt(sc.nextLine());
      
      System.out.println("Enter   Name :");
      String namem = sc.nextLine();
      
      System.out.println("Enter  Basic Salary :");
      double basicSalarym=Double.parseDouble(sc.nextLine());
      
      System.out.println("Enter HRAper :");
      double HRAperm = Double.parseDouble(sc.nextLine());
      
      System.out.println("Enter DAper");
      double DAperm = Double.parseDouble(sc.nextLine());
      
      System.out.println("Enter Project Allowance");
      double projectAllowance=Double.parseDouble(sc.nextLine());
      
      Manager m1 = new Manager(idm, namem,basicSalarym,HRAperm,DAperm,projectAllowance);
      
      System.out.println("Manager "+e2.calculateTax(m1));
      
      
      
      System.out.println("Employee Tax :"+e2.calculateTax(e1));
      sc.close();
	}

}
class Employee{
	private int employeeId;
	private String name;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	public Employee(int employeeId,String name,double basicSalary,double HRAper,double DAper) {
	this.employeeId=employeeId;
	this.name=name;
	this.basicSalary=basicSalary;
	this.HRAper=HRAper;
	this.DAper=DAper;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public String  getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary=basicSalary;
	}
	public double getHRAper() {
		return HRAper;
	}
	public void setHRAper(double HRAper) {
		this.HRAper=HRAper;
	}
	public double setDAper() {
		return DAper;
	}
	public void getDAper(double DAper) {
		this.DAper=DAper;
	}
    public double calculateGrossSalary() {
    	return (basicSalary+HRAper+DAper);
    } 
}
class Manager{
	private int managerId;
	private String managerName;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	private double projectAllowance;
	public Manager(int managerId, String managerName, double basicSalary, double hRAper, double dAper,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.projectAllowance = projectAllowance;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getHRAper() {
		return HRAper;
	}
	public void setHRAper(double hRAper) {
		HRAper = hRAper;
	}
	public double getDAper() {
		return DAper;
	}
	public void setDAper(double dAper) {
		DAper = dAper;
	}
	public double getProjectAllowance() {
		return projectAllowance;
	}
	public void setProjectAllowance(double projectAllowance) {
		this.projectAllowance = projectAllowance;
	}
	public double calculateGrossSalary() {
		return (basicSalary+HRAper+DAper+projectAllowance);
	}
}
	class TaxUtil{
	public double calculateTax (Employee e) {
      if (e.calculateGrossSalary()>50000) {
	   return ((e.calculateGrossSalary()*20)/100); 
			}
	 else {
	return ((e.calculateGrossSalary()*5)/100);
 		}
	}
	public double calculateTax(Manager m) {
		if(m.calculateGrossSalary()>50000) {
			return ((m.calculateGrossSalary() *20)/100);
		}
		else {
			return ((m.calculateGrossSalary()*5)/100);
		}
	  }		
	}


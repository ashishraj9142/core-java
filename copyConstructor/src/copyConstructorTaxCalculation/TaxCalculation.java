package copyConstructorTaxCalculation;

import java.util.Scanner;

public class TaxCalculation {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Your name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Your Basic Salary ");
		double basicSalary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter HRAper :");
		double HRAper = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter DAper");
		double DAper = Double.parseDouble(sc.nextLine());
		
		Employee e1 = new Employee(id, name,basicSalary, HRAper, DAper);
		TaxUtil e2 = new TaxUtil();
		System.out.println("Employee Tax "+e2.calculateTax(e1));
		System.out.println("Manager Tax "+e2.calculateTax(e1));
		System.out.println("Trainer Tax "+e2.calculateTax(e1));
		System.out.println("Sourcing Tax "+e2.calculateTax(e1));
		sc.close();
	}

}
class Employee{
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	public Employee(int employeeId,String employeeName,double basicSalary,double HRAper, double DAper) {
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.basicSalary = basicSalary;
	this.HRAper = HRAper;
	this.DAper=DAper;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double calculateGrossSalary() {
		return (basicSalary+HRAper+DAper);
	}
  }
class Manager {
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
		this.HRAper = hRAper;
		this.DAper = dAper;
		this.projectAllowance = projectAllowance;
	}
	public double calculateGrossSalary() {
	  return (basicSalary+HRAper+DAper+projectAllowance);
	}
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", HRAper=" + HRAper + ", DAper=" + DAper + ", projectAllowance=" + projectAllowance + "]";
	}
	
}
class Trainer{
	private int trainerId;
	private String trainerName;
	private double basicSalary;
	private double HRAper;
	private double DAper;
	private int batchCount;
	private double perkPerBatch;
	public Trainer(int trainerId, String trainerName, double basicSalary, double hRAper, double dAper, int batchCount,
			double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public double calculateGrossSalary() {
		return (basicSalary+HRAper+DAper+(batchCount * perkPerBatch));
	}
}
class Sourcing{
	private int sourceId;
	private String sourceName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	public Sourcing(int sourceId, String sourceName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
}
class TaxUtil{
	public double calculateTax(Employee e) {
		if (e.calculateGrossSalary()>50000) {
		 return ((e.calculateGrossSalary()*20)/100);	
		}
		else {
			return (e.calculateGrossSalary()*5)/100;
		}
	}
	public double calculateTax(Manager m1) {
		if(m1.calculateGrossSalary()>50000) { 
		return (m1.calculateGrossSalary()*20)/100;
	}
		else {
			return ((m1.calculateGrossSalary()*5)/100);
		}
		}
	public double calculateTax(Trainer t1) {
	if(t1.calculateGrossSalary()>50000) { 
	return (t1.calculateGrossSalary()*20)/100;
	}
	else {
	return ((t1.calculateGrossSalary()*5)/100);
	}
        }
    public double calculateTax(Sourcing s) {
    if(s.calculateGrossSalary()>50000) { 
	return (s.calculateGrossSalary()*20)/100;
	}
	else {
	return ((s.calculateGrossSalary()*5)/100);
		}
	}
}



























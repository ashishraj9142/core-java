package blc;

public class Employee {
	String firstName;
	String lastName;
	int employeeId;
	double employeeSalary;
	int noOfProject;
	
//	public void setEmployeeData(String fName,String lName, int id,double salary,int noproject) {
//     firstName = fName;
//     lastName = lName;
//     employeeSalary = salary;
//     noOfProject = noproject;
//     employeeId = id;
//	}
	
	public Employee(String fName,String lName, int id,double salary,int noproject) {
		firstName = fName;
	     lastName = lName;
	     employeeSalary = salary;
	     noOfProject = noproject;
	     employeeId = id;
	}
	public Employee(String fName,String lName) {
		firstName = fName;
	     lastName = lName;
	}
	public Employee(String lName, int id,double salary) {
		lastName = lName;
	     employeeSalary = salary;
	}
	
    public void calculateSalary() {
    if (noOfProject>5  &&  noOfProject<10) {
    	employeeSalary = employeeSalary+5000;
    }
    else if (noOfProject>10 && noOfProject<20) {
    	employeeSalary = employeeSalary+10000;
    }
    
    else if (noOfProject>20) {
    	employeeSalary = employeeSalary+15000;
    }		
        }
    public String displayDetails() {
      return  ("First Name : "+firstName+" Last Name: "+lastName+" Employee Id : "+employeeId+" Employee Salary: "+employeeSalary+" No of Project: "+noOfProject);
    }
    
    }


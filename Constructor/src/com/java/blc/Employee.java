package com.java.blc;

public class Employee {
	
	
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProject;
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProject = noOfProject;
	}
	
	public void  calculateSalary(){
		double salarys;
		if(noOfProject>5 &&noOfProject<10) {
		salarys = salary+5000;
	    }
		else if(noOfProject>10 && noOfProject<20) {
		  salarys = (salary+10000);	
		}
		else {
			salarys = salary+15000; 
		}
		System.out.println(" Salary should be updated to"+salarys);
		
		}
	
	
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProject=" + noOfProject + "]";
	}
	

}

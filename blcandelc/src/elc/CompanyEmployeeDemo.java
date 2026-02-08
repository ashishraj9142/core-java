package elc;

import java.util.Scanner;

import blc.CompanyEmployee;

public class CompanyEmployeeDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Employee Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee Salary");
		double salary = Double.parseDouble(sc.nextLine());
		
		
		 
		CompanyEmployee raj = new CompanyEmployee();
		raj.setEmployeeDetails(id, name, salary);
        System.out.println("customer details: "+raj.employeeDetails());
        raj.calculateSalaryIncrement();

        sc.close();

	}

}

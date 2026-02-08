package elc;

import java.util.Scanner;

import blc.Employee;


public class EmployeeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your First Name :");
		String FName = sc.nextLine();

		
		System.out.println("Enter your Last Name :");
		String lName = sc.nextLine();
		
		
		System.out.println("Enter your Employee Id :");
		int id = Integer.parseInt(sc.nextLine());
		
		
		System.out.println("Enter Employee Salary :");
		double salarys = Double.parseDouble(sc.nextLine());
		
		
		System.out.println("Enter No Of Project :");
		int project = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		Employee employee = new Employee(FName, lName, id, salarys, project);
//		employee.setEmployeeData(FName, lName, id, salarys, project);
		Employee employee1 = new Employee(FName, lName);
		employee.calculateSalary();
		employee1.calculateSalary();
		String res = employee.displayDetails();
		String res1 = employee1.displayDetails();
		System.out.println(res+" \n"+res1);
		
		
		
		
	}
     
}

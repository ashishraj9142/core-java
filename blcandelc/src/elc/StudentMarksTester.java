package elc;

import java.util.Scanner;

import blc.StudentMarks;

public class StudentMarksTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Id Number");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Student marks");
		int marks = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Student Name");
		String name = sc.nextLine();
		sc.close();
		
		StudentMarks Rohit = new StudentMarks();
		Rohit.setStudentData(id, name, marks);
		Rohit.calculateGrade();
		System.out.println(Rohit.displayDetails());

	}

}

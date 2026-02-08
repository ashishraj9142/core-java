package copyConstructor;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your Marks");
        int marks = Integer.parseInt(sc.nextLine());
        Student s1 = new Student(name, marks);
        StudentGrade s2 = CalculateStudentGrade.calculateGrade(s1);
        System.out.println(s2);
	    sc.close();
	}
	

}

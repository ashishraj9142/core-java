package elc;

import java.util.Scanner;

import blc.Student;

public class StudentExamResult {
public static void main (String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Marks");
	double marks = sc.nextDouble();
	
	String grade = Student.calculateGrade(marks);
   System.out.println(grade);
      sc.close();
    }
}

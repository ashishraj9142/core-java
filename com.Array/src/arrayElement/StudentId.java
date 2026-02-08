package arrayElement;

import java.util.Scanner;

class Student
{
private int id;
private String name;
public Student (int id,String name) {
	this.id = id;
	this.name = name;
}
public String toString() {
	return "Student [id="+ id + ", name=" + name +"]";
}

  }

public class StudentId {
public static void main(String[]args) {
//	Student students[] = new Student[5];
//	//Scanner sc = new Scanner(System.in);
//	students[0] = new Student(111,"Raj");
//	students[1] = new Student(222,"Ram");
//	students[2] = new Student(333,"Rahul");
//	students[3] = new Student(444,"Scoot");
//	students[4] = new Student (555,"Alen");
//	for (Student student : students)
//	{
//		System.out.println(student);
//	}
// }
    Scanner sc = new Scanner(System.in);

    Student students[] = new Student[5];

    for (int i = 0; i < students.length; i++) {
        System.out.println("Enter Student ID:");
        int id = sc.nextInt();

        System.out.println("Enter Student Name:");
        String name = sc.next();

        students[i] = new Student(id, name);
       
    }
    System.out.println("\nStudent Details:");
    for (Student student : students) {
        System.out.println(student);
    }
    sc.close();
  }
}

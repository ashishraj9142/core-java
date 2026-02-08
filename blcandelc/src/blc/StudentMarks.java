package blc;

public class StudentMarks {
	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
   public void  setStudentData (int id,String name,int marks) {
	   studentId = id;
	   studentName = name;
	   studentMarks = marks;
   }
   public void calculateGrade() {
	   if (studentMarks>90) {
		   studentGrade = 'A';		  
	   }
	   

	   else if (studentMarks>=81 && studentMarks<=90) {
		   studentGrade = 'B'; 
	   }
	   
	   else if (studentMarks>=71 && studentMarks<=80) {
		   studentGrade = 'C';
	   }
	   
	   
	   else if (studentMarks>=61 && studentMarks<=70) {
		   studentGrade = 'D';
	   }
	   
	   else {
		   studentGrade = 'E';
	   }
   }
   public String displayDetails() {
	   return ("Student Name : "+studentName+" Student Id: "+studentId+" StudentMarks :"+studentMarks+" Student Grade: "+studentGrade);
   }
}

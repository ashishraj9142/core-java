package blc;

public class CompanyEmployee {
int id;
String name;
double salary;
public void setEmployeeDetails(int id,String name,double salary ) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}	
public void calculateSalaryIncrement() {
	double incrementSalary;
	
	if(salary<50000) {
	    incrementSalary = (salary*0.10);
	} 
	else if (salary>50000 && salary<80000) {
	    incrementSalary = ((salary*0.07));
	    

	}
	else {
		incrementSalary = ((salary*0.05));
	
	}
	System.out.println("Salary increment amount"+incrementSalary);
	System.out.println( "After increment, Updated salary " +(incrementSalary+salary));
	
}

public String employeeDetails() {
	return "CompanyEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
}

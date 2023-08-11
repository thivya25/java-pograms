package code1;  
import java.util.Scanner;

class employee{
	  int employeeid;
	  String employeename;
	  int employeeage;
	 

	void inputEmployeeData() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter name");
		  employeename =sc.nextLine();
		  
		  System.out.println("Enter id");
		  employeeid = sc.nextInt();
		  
		  System.out.println("Enter age");
		  employeeage = sc.nextInt();
		  
	  }
	  
	  void displayEmployeeDetails(){
	     System.out.println("Student id ="+employeeid);
	     System.out.println("Student name="+employeename);
	     System.out.println("Student age ="+employeeage);
	   }
   @Override
	public String toString() {
		return "Student [studentid=" + employeeid + ", studentname=" + employeename + ", studentage=" + employeeage + "]";
	}
	  
}
public class employeedetails{
	     public static void main(String args[]){
	              System.out.println("Main");
	             
	              employee ed1 = new employee();
	              
	              ed1.inputEmployeeData();
	                   ed1.displayEmployeeDetails();
	                   System.out.println(ed1);
	                   
	                   employee ed2 = new employee();
	                   ed2.inputEmployeeData();
	                   ed2.displayEmployeeDetails();
	                   System.out.println(ed2);
	         }
}

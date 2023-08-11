package code1;

class Student{
	  int studentid;
	  String studentname;
	  int studentage;
	  
	  void displayStudentDetails(){
	     System.out.println("Student id ="+studentid);
	     System.out.println("Student name="+studentname);
	     System.out.println("Student age ="+studentage);
	   }

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage + "]";
	}

	
	  
	}

public class MainApp{
	     public static void main(String args[]){
	              System.out.println("Main");
	             
	              Student sob = new Student();
	                   sob.displayStudentDetails();
	          }
	}
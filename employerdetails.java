package code1;

import java.util.Scanner;

public class employerdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e_id;
		String e_name;
		int e_age;
		float e_salary;
		char e_gender;
		String dept;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE EMPLOYEE ID");
		e_id =  sc.nextInt();
		sc.nextLine();		
		System.out.println("ENTER THE EMPLOYEE NAME");
		e_name =  sc.nextLine();
		System.out.println("ENTER THE AGE");
		e_age =  sc.nextInt();
		System.out.println("ENTER THE SALARY");
		e_salary =  sc.nextInt();
		System.out.println("ENTER THE GENDER");
		e_gender =  sc.next().charAt(0);
		System.out.println("EMPLOYEE ID:"+"     "+e_id);
		System.out.println("EMPLOYEE NAME:"+"   "+e_name);
		System.out.println("EMPLOYEE AGE:"+"    "+e_age);
		System.out.println("EMPLOYEE SALARY:"+" "+e_salary);
		System.out.println("EMPLOYEE GENDER:"+" "+e_gender);
		
		
		
		
		
				

	}

}

package thivyashreepackage;

import java.util.Scanner;

class students 
{
	int age;
	String name;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name");
		name = sc.nextLine();
		     
		System.out.println("Enter age");
		age = sc.nextInt();
	}
		void display()
		{
			System.out.println("Name ="+name);
		    System.out.println("Age="+age);
		}
}
class hremployee 
{
	 void displayHr(students s1) {
		 System.out.println("STUDENT details");
		 System.out.println("name="+s1.name);
		 System.out.println("age="+s1.age);
		 
	 }
	
	
}
	public class studentsclasses
	{
	public static void main(String args[]){
		students sob=new students();
		sob.input();
		hremployee hob=new hremployee();
		hob.displayHr(sob);
		
	//sob.display(); 
		}
}




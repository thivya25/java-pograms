package mainapppackage2;

import java.util.Scanner;

public class HR {
   protected int id;
   protected String name;
   
   public void input() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter name");
	   name=sc.nextLine();
	   System.out.println("Enter id ");
	   id=sc.nextInt();
   }
   protected void display() {
	   System.out.println("Name="+name);
	   System.out.println("id="+id);
   }
   
   
}

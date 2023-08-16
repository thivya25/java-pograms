package code1;

import java.util.Scanner;

public class pattern1 {
	int num;
	void userInput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		num=sc.nextInt();
	}
	void pattern1() 
	{
		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(i+" ");
			}System.out.println();
		}
	
		
	}
	void pattern2() {

		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*" +" ");
			}System.out.println();
		}
	
		
	}
	void pattern3() {

		for(int i=num;i>=1;i--) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*" +" ");
			}System.out.println();
		}
	
		
	}
	

	public static void main(String[] args) {
		pattern1 sc=new pattern1();
		sc.userInput();
		sc.pattern1();
		sc.pattern2();
		sc.pattern3();
		
		}

}

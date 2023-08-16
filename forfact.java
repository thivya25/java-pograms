package code1;

import java.util.Scanner;

public class forfact {
	long fact=1;
	int num;
	void userInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
	}
	void condition() {
		for(int i=num;i>=1;i--) {
			fact=fact*i;
			
		}
		System.out.println("the factorial of "+num+" is "+fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forfact sc=new forfact();
		sc.userInput();
		sc.condition();
		
		
		

	}

}

package code1;

import java.util.Scanner;

public class forprime {
	int num,c=0;
	void userInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
	}
	void condition() {
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime");
		}
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				flag=false;
			}
		if (flag) {
			System.out.println(num+"is prime");
		}
		else {
			System.out.println(num+"is not prime");
		}
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forprime sc=new forprime();
		sc.userInput();
		sc.condition();
		

	

	}

}

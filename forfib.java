package code1;

import java.util.Scanner;

public class forfib {
	int num;
	void userInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
	}
	void condition() {
		int num1=0,num2=1,num3=0;
		System.out.print(num1+","+num2);
		for (int i=3;i<=num;i++) {
			  num3=num1+num2;    
			  System.out.print(" ,"+num3);    
			  num1=num2;    
			  num2=num3;  
		}
	}
public static void main(String[] args) {
	forfib sc=new forfib();
	sc.userInput();
	sc.condition();
	}

}

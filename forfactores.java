package code1;

import java.util.Scanner;

public class forfactores {
	int num;
	void userInput() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
	}
	void condition() {
		System.out.print("the factors of "+num+" is ");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+","+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forfactores sc=new forfactores();
		sc.userInput();
		sc.condition();
		
		
		
			
	}
}

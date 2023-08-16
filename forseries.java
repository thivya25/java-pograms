package code1;

import java.util.Scanner;

public class forseries {
	double sum=0.0,num;
	void userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		num=sc.nextDouble();
	}
	void series1() {
		for(int i=1;i<=num;i++) {
			sum=sum + (1/(double)i) ;
			
		}
		System.out.println(sum);
	}
	void series2() {
		double sum2=0.0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0) {
				sum=sum + (1/(double)i) ;
			}
			else {
				sum2=sum2 + (1/(double)i) ;
			}
			
		}System.out.println(sum-sum2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forseries sc=new forseries();
		sc.userInput();
		sc.series1();
		sc.series2();
		
		
		
		

	}

}

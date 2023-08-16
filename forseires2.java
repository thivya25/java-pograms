package code1;

import java.util.Scanner;

public class forseires2 {
	public static void main(String[] args) {
		double sum=0.0,num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		num=sc.nextDouble();
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			sum=sum + (1/fact) ;
			System.out.println(fact);
			
		}
		System.out.println(sum);
		
	}

}

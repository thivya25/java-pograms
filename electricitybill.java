package code1;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NAME :");
		String name=sc.next();
		System.out.println("ENTER THE UNIT:");
		int units =sc.nextInt();
		
		float amount;
		if(units<=200) {
			amount=units*3.80f;
			
		}else if(units>200 && units<=300) {
			amount=200*3.80f+(units-200)*4.40f;

			
		}else if(units>300 && units<=400) {
			amount=200*3.80f+100*4.40f+(units-300)*5.10f;
			
		}else {
			amount=200*3.80f+100*4.40f+100*(units-400)*5.80f;
		}
		System.out.println("THE CUSTOMER NAME IS: "+name);
		System.out.println("THE AMOUNT IS: "+amount);
		

	}

}

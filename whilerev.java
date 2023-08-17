package code1;

import java.util.Scanner;



public class whilerev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,rev=0,rem;;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		num=sc.nextInt();
		
		while(num!=0) {
			rem=num%10;
			rev=rev*10 +rem;
			num=num/10;
			
		}
		System.out.println("THE REVERSE NUMBER IS: "+rev);

	}

}

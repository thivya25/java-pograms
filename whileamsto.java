package code1;

import java.util.Scanner;

public class whileamsto {

	public static void main(String[] args) 
	{
		int num,amg=0,rem,orgnum;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		num=sc.nextInt();
		orgnum=num;
		
		while(num!=0) 
		{
			rem=num%10;
			amg=amg+(rem*rem*rem);
			num=num/10;
			
		}
		if(amg==orgnum) {
		System.out.println("THE NUMBER"+num+" IS AMSTRONG NUMBER ");

	}
		else {
			System.out.println("THE NUMBER" +num+"IS NOT AMSTRONG NUMBER ");
		}


	}
}




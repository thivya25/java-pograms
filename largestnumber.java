package code1;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER1,2 AND 3:");
		int num1 = sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" IS LARGEST");
		}
		else if(num2>num3) {
			System.out.println(num2+" IS LARGEST");
		}
		else {
			System.out.println(num3+" IS LARGEST");
		}

	}

}

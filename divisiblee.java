package code1;

import java.util.Scanner;

public class divisiblee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int num = sc.nextInt();
		if(num==0) {
			System.out.println("INVALID");
		}
		else if (num%3==0 && num%5==0) {
			System.out.println("NUMBER IS DIVISIBLE BY 3 AND 5");
		}
		else if(num%3==0) {
			System.out.println(" NUMBER IS DIVISIBLE BY 3");
		}
		else {
			System.out.println(" NUMBER IS DIVISIBLE BY 5");
		}

	}

}

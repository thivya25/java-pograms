package code1;

import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int num = sc.nextInt();
		if (num%2==0) {
			System.out.println("NUMBER IS EVEN");
		}
		else {
			System.out.println(" NUMBER IS POSITIVE");
		}
		

	}

}

package code1;

import java.util.Scanner;

public class votecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int age = sc.nextInt();
		if (age>=18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println(" Not Eligible");
		}
		

	}

}

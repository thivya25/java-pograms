package code1;

import java.util.Scanner;

public class dowhilefact {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER: ");
		int num=sc.nextInt();
		int i=1,fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		System.out.println("THE FACTORIAL OF "+num+" is "+fact);
		// TODO Auto-generated method stub

	}

}

package code1;

import java.util.Scanner;

public class reversenum {

	public static void main(String[] args) {
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER:");
		int number =sc.nextInt();
		result +=number%10;
		number=number/10;
		result=(result*10)+(number%10);
		number=number/10;
		result=(result*10)+(number%10);
		number= number/10;
		System.out.println("THE REVERSED NUMBER IS :"+result);
		// TODO Auto-generated method stub

	}

}

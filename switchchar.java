package code1;

import java.util.Scanner;

public class switchchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER CHARACTER");
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'i':
		case 'I':
		case 'O':
		case 'o':
		case 'u':
		case 'U':System.out.println(ch+" IS VOWEL");
		         break;
		default:System.out.println("NOT A VOWEL");
			
		}
		

	}

}

package code1;

import java.util.Scanner;

public class marks {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER THE GRADE:");
	char grade = sc.next().charAt(0);
	if(grade=='A' || grade=='a') {
		System.out.println("your mark is between 90 to 100");
	}else if(grade=='B' || grade=='b') {
		System.out.println("your mark is between 70 to 89");
	}else if(grade=='c' || grade=='C') {
		System.out.println("your mark is between 50 to 79");
	}else if(grade=='D' || grade=='d') {
		System.out.println("your mark is between 1 to 40");
	}else {
		System.out.println("INVALIDa");
	}
}
}

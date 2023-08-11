package code1;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		int mark = sc.nextInt();
		if (mark<=0 || mark>=101) {
			System.out.println("INVAILD");
		}
		else if(mark>=90 && mark<=100) {
			System.out.println("GRADE IS A");
		}else if(mark>=70 && mark<=89) {
			System.out.println("GRADE IS B");
		}else if(mark>=50 && mark<=69) {
			System.out.println("GRADE IS c");
		}else {
			System.out.println("GRADE IS D");
		}

	}

}

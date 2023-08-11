package code1;

import java.util.Scanner;

public class ternaryopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l;
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER A,B,C,D: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		l=(a>b)?a:b;
		System.out.println("largest of "+a+" and "+ b+" is "+l);
		
		l=(a>b && a>c)?a:(b>a && b>c)?b:c;
		System.out.println("largest of "+a+","+b+" and "+ c+" is "+l);
		
		l=(a>b && a>c && a>d)?a:(b>c && b>d )?b:( c>d)?c:d;
		System.out.println("largest of "+a+","+b+ ","+ c+" and "+d+" is "+l);
		
		
		
		
		
		
		
		
		
		
		

	}

}

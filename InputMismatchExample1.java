package code1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER 1 FOR AREA OF CIRCLE");
		System.out.println("ENTER 2 FOR AREA OF SQUARE");
		System.out.println("ENTER 3 FOR AREA OF RECTANGLE");
		System.out.println("ENTER 4 FOR AREA OF TRINANGLE");
		System.out.println("CHOSE YOUR CHOICE");
		
		try {
			int userinput =sc.nextInt();
			switch(userinput) {
			case 1:
				System.out.println("ENTER THE VALUE OF RADIUS");
				double r=sc.nextDouble();
				System.out.println("THE AREA OF CIRCLE IS "+(2*3.14*r*r));
				break;
			case 2:
				System.out.println("ENTER THE VALUE OF SIDE ");
				double a=sc.nextDouble();
				System.out.println("THE AREA OF SQUARE IS "+(a*a));
				break;
			case 3:
				System.out.println("ENTER THE VALUE OF LENGHT ");
				double l=sc.nextDouble();
				System.out.println("ENTER THE VALUE OF BREATH ");
				double b=sc.nextDouble();
				System.out.println("THE AREA OF RECTANGLE IS "+(l*b));
				break;
			case 4:
				System.out.println("ENTER THE VALUE OF BASE ");
				double base=sc.nextDouble();
				System.out.println("ENTER THE VALUE OF HEIGHT ");
				double height=sc.nextDouble();
				System.out.println("THE AREA OF RECTANGLE IS "+(base*height*0.5));
				break;
				
				default:System.out.println("INVALID INPUT");
			}
		}
		catch(InputMismatchException e) 
		{
			System.out.println("ENTER CORRECT INPUT");
		}
			
		
		

	}

}

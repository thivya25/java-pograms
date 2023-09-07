package thivyashreepackage;

import java.util.Scanner;

public class CarTravelDistance 
{
	
	int userInput() {
		System.out.println("ENTER THE TIME");
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		return t;
	
	}
	int userInput2() {
		System.out.println("ENTER THE TIME");
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		return t;
	
	}
	
	int condition(int t) {
		int d;
		int u=10,a=5;
		d=u*t+((a*t*t)/2);
		return d;
		}
	int condition2(int t2) {
		int d;
		int u=10,a=5;
		d=u*t2+((a*t2*t2)/2);
		return d;
		}


	public static void main(String[] args)
	{
		CarTravelDistance ob= new CarTravelDistance();
		CarTravelDistance ob2= new CarTravelDistance();
		int  t=ob.userInput();
		int  t2=ob2.userInput();
		int result =ob.condition(t);
		int result2 =ob2.condition(t2);
		System.out.println("THE distance is "+result);
		System.out.println("THE distance is "+result2);
		// TODO Auto-generated method stub

	}

}

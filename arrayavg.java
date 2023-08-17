package code1;

import java.util.Scanner;

public class arrayavg {

	public static void main(String[] args) {
		int size,avg,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the element of the array");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println("THE AVERAGE IS: "+avg);
		

	}

}

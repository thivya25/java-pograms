package code1;

import java.util.Scanner;

public class arrayy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBERS: ");
		for (int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();}
		System.out.println("ENTERED NUMBERS ARE");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			}
		for(int i=0;i<arr.length;i++) {
			sum=sum+i;
		}System.out.println("THE SUM OF ALL ELEMENT IS:"+sum);
		

	}

}

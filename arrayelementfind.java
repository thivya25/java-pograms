package code1;

import java.util.Scanner;

public class arrayelementfind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,arr[],search;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		size=sc.nextInt();
		arr=new int[size];
		System.out.println("enter the element ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element to search");
		search=sc.nextInt();
		int c=0;
		for(int i=0;i<arr.length;i++) {
			
			if(search==arr[i]) {
				c++;
				}
		}if(c>=1){
			System.out.println(search+" ELEMENT IS FOUND");
			}else {
				System.out.println(search+" ELEMENT IS  NOT FOUND");
			}
	}

}



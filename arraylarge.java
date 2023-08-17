package code1;

import java.util.Arrays;
import java.util.Scanner;

public class arraylarge 
{
	int size;
	int arr[];
	void userInput() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		size=sc.nextInt();
		arr = new int[size];
		System.out.println("enter the element ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
	}
	//array sorting without sort() method
	void largestNum1() 
	
	{
		for(int i=0;i<arr.length;i++) { 
			int temp;
			//sorting in  ascending order
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{ 
					temp=arr[i]; 
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
		}System.out.println("THE LARGEST NUMBER IS: "+arr[size-1]);
	}
	//array sorting sort() method
	void largestNum2()
	{
		Arrays.sort(arr);
		System.out.println("THE LARGEST NUMBER IS: "+arr[size-1]);
	}
	//smallest of the array
	void smallestNum() {
		System.out.println("THE SMALLEST NUMBER IS: "+arr[0]);
	}
	//second largest of the array
	void secondLargestNum() {
		System.out.println("THE SECOND LARGEST NUMBER IS: "+arr[size-2]);
	}


	public static void main(String[] args) 
	{
		arraylarge sc=new arraylarge();
		sc.userInput();
		sc.largestNum1();
		sc.largestNum1();
		sc.smallestNum();
		sc.secondLargestNum();
}
}
	
		
	

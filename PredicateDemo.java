package mainapppackage2;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr =new int[5];
		System.out.println("ENTER THE ELEMENT");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		Predicate<Integer> pobj =(i)->i%2==0;
		Predicate<Integer> pobj1 =(i)->i%2!=0;
		Predicate<Integer> pobj2 =(i)->true;
		evenNumer(pobj,arr);
		oddNumber(pobj1,arr);
		printNumber(pobj2,arr);

	}

	private static void printNumber(Predicate<Integer> pobj2, int[] arr) {
		System.out.println("ALL NUMBER: ");
		for(int i:arr) {
			if(pobj2.test(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static void oddNumber(Predicate<Integer> pobj1, int[] arr) {
		System.out.println("ODD NUMBER: ");
		for(int i:arr) {
			if(pobj1.test(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static void evenNumer(Predicate<Integer> pobj, int[] arr) {
		System.out.println("EVEN NUMBER: ");
		for(int i:arr) {
			if(pobj.test(i)) {
				System.out.println(i);
			}
		}
		
		
	}

}

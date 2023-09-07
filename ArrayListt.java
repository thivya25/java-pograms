package thivyashreepackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListt {

	public static void main(String[] args) {
		ArrayList<Integer> lst=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE 5 ARRAY ELEMENT");
		for(int i=1;i<=5;i++) {
			lst.add(sc.nextInt());
		}
		System.out.println(lst);
		Iterator<Integer> iterator =lst.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("ENTER THE ELEMENT TO SEARCH");
		int searchnum =sc.nextInt();
		if(lst.contains(searchnum)) {
			
			lst.remove(lst.indexOf(searchnum));
			
			//System.out.println(searchnum+" IS PRESENT IN "+lst.indexOf(searchnum+1));
		}
		else {
			System.out.println(searchnum+" IS NOT  PRESENT");
		}
		System.out.println(lst);
	}

}

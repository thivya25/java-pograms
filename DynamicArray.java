package thivyashreepackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class DynamicArray {

	public static void main(String[] args) {
		Vector<String> str=new Vector<String>();
		str.add("HI");
		str.add("ALL");
		str.add("WELCOME");
		System.out.println(str);
		ArrayList<Integer> inte=new ArrayList<Integer>();
		inte.add(1);
		inte.add(10);
		inte.add(5);
		inte.add(4);
//		System.out.println("BEFORE SWAPPING"+inte);
//		Collections.swap(inte,2,3);
//		System.out.println("AFTER SWAPPING "+inte);
//		Collections.sort(inte);
//		System.out.println(inte);
//		Collections.shuffle(inte);
//		System.out.println(inte);
//		Collections.reverse(inte);
		System.out.println(inte);
		ArrayList<Float> floatt =new ArrayList<Float>();
		floatt.add(12.35f);
		floatt.add(10.54f);
		System.out.println(floatt);
		ArrayList<Double> doubleint = new ArrayList<Double>();
		doubleint.add(11.20);
		System.out.println(doubleint);
		ArrayList<Float> lst1=new ArrayList<Float>();
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.println("ENTER THE ELEMENT");
			lst1.add(sc.nextFloat());
		}
		lst1.add(2,2f);
		System.out.println(lst1);
		lst1.clear();
		System.out.println(lst1);
	}

}

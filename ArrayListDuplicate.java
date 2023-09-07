package thivyashreepackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayListDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(25);
		list.add(25);
		list.add(35);
		list.add(56);
		
		LinkedHashSet<Integer> linkedset =new LinkedHashSet<Integer>(list);
		System.out.println(linkedset);
		System.out.println(linkedset.size());
		
	}

}

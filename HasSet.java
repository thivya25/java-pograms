package mainapppackage2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HasSet {

	public static void main(String[] args) {
		HashSet<Integer> hobj=new HashSet<Integer>();
		hobj.add(12);
		hobj.add(34);
		hobj.add(79);
		hobj.add(null);
		hobj.add(34);
		hobj.add(79);
		hobj.add(null);
		System.out.println(hobj);
		LinkedHashSet<Integer> hobj1= new LinkedHashSet<Integer>();
		hobj1.add(12);
		hobj1.add(34);
		hobj1.add(79);
		hobj1.add(null);
		hobj1.add(34);
		hobj1.add(79);
		hobj1.add(null);
		System.out.println(hobj1);
		TreeSet<Integer> hobj2= new TreeSet<Integer>();
		hobj2.add(12);
		hobj2.add(34);
		hobj2.add(89);
		hobj2.add(0);
		hobj2.add(-1);
		hobj2.add(34);
		hobj2.add(79);
		
		System.out.println(hobj2);
	}

}

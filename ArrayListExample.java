package mainapppackage2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> inte=new ArrayList<Integer>();
		inte.add(1);
		inte.add(10);
		inte.add(-5);
		inte.add(4);
		inte.add(19);
		inte.add(-1);
		inte.add(0);
		System.out.println("BEFORE SWAPPING "+inte);
		Collections.swap(inte,2,3); //index[2] and index[3] is swapped
		System.out.println("AFTER SWAPPING"+inte);
		Collections.sort(inte);
		System.out.println("AFTER SORTING "+inte);
		Collections.shuffle(inte);
		System.out.println("AFTER SHUFFLING "+inte);
		Collections.reverse(inte);
		System.out.println("AFTER REVERSEING "+inte);

	}

}

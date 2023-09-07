package mainapppackage2;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {
 //predicate is  predefined functional interface ,it takes only one arugument and returns boolean value
	//test()-->already defined method on predicate
	public static void main(String[] args) {
		Predicate<Integer> obj =( i)->(i)>10;
		int num=10;
		boolean p=obj.test(num);
		System.out.println("result = "+p);

	}

}

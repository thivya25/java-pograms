package mainapppackage2;

import java.util.function.Predicate;



public class PredicateExample {

	public static void main(String[] args) {
		int arr[]= {7,3,5,15,7,9,40,1,10,16,2};
		Predicate<Integer> pobj =(i)->(i)>10;
		filterNumber(pobj,arr);
		Predicate<Integer> pobj1 =(i)->(i)%2==0;
		filterEvenNumber(pobj1,arr);
		Predicate<Integer> pobj2 =(i)->(i)%2!=0;
		filteroddNumber(pobj2,arr);
	}

	private static void filteroddNumber(Predicate<Integer> pobj2, int[] arr) {
		for(int i:arr) {
			if(pobj2.test(i)) {
				System.out.println("odd number"+i);
			}
		}
		
	}

	private static void filterEvenNumber(Predicate<Integer> pobj1, int[] arr) {
		for(int i:arr) {
			if(pobj1.test(i)) {
				System.out.println("even number"+i);
			}
		}
		
	}

	private static void filterNumber(Predicate<Integer> pobj, int[] arr) {
		for(int i:arr) {
			if(pobj.test(i)) {
				System.out.println("number greater than 10 is "+i);
			}
		}
		
	}

}

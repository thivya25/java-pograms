package mainapppackage1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class StreamSumMain {

	public static void main(String[] args) {
		List<Integer> lst =Arrays.asList(2,3,4,5,6);
		List<Integer> lst2=new ArrayList<Integer>();
		lst2.add(2);
		lst2.add(3);
		lst2.add(4);
		int data=lst2.stream().filter(i->i%2==0).map(i->i+2).reduce(0, (ans,i)->ans+i);
		int sum=lst.stream().reduce(0, (ans,i)->ans+i);
		System.out.println(sum);
		System.out.println(data);
	}

}

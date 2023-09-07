package mainapppackage1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class StreamAPIExample {

	public static void main(String[] args) {
		List<Integer> lst =new ArrayList<Integer>();
		lst.add(10);
		lst.add(39);
		lst.add(90);
		lst.add(56);
		 long n =lst.stream().filter(i->i%2==0).count();
//		 List<Integer> lst =lst.stream().map(i->i+9).collect(Collector.tolist());
		

	}

}

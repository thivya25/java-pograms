package mainapppackage1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListLambda {

	public static void main(String[] args) {
		List<String > obj =new ArrayList<String>();
		obj.add("th");
		obj.add("iv");
		Iterator<String > lobj =obj.iterator();
		while(lobj.hasNext()) {
			
		}
		obj.forEach(name->{
			System.out.println(name);
		});

	}

}

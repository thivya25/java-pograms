package mainapppackage1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExampleMain {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap =new HashMap<Integer,String>();
		hashmap.put(1, "thivya");
		hashmap.put(2, "ramya");
		hashmap.put(3, "ramya");
		hashmap.put(4, "geetha");
		hashmap.put(5, "geethu");
		hashmap.put(6, "kani");
		hashmap.put(6, "mani");
		System.out.println(hashmap);
		
		LinkedHashMap<Integer,String> hashmap1 =new LinkedHashMap<Integer,String>();
		hashmap1.put(1, "thivya");
		hashmap1.put(3, "ramya");
		hashmap1.put(2, "ramya");
		hashmap1.put(5, "geetha");
		hashmap1.put(5, "geethu");
		hashmap1.put(6, "kani");
		hashmap1.put(4, "mani");
		System.out.println(hashmap1);
		TreeMap<Integer,String> hashmap2 =new TreeMap<Integer,String>();
		hashmap2.put(1, "thivya");
		hashmap2.put(3, "ramya");
		hashmap2.put(2, "ramya");
		hashmap2.put(5, "geetha");
		hashmap2.put(5, "geethu");
		hashmap2.put(6, "kani");
		hashmap2.put(4, "mani");
		System.out.println(hashmap2);
		for(Map.Entry<Integer, String> mobj:hashmap.entrySet()) //using map.entrySet() for iteration  
		{  
		//returns keys and values respectively  
		System.out.println("ROLLNUMBER: " + mobj.getKey() + ", NAME: " + mobj.getValue());   
		}   
		for(Map.Entry<Integer, String> mobj2:hashmap1.entrySet()) {
			System.out.println("ROLLNUMBER" + mobj2.getKey() +", NAME: "+mobj2.getValue());
		}

		
	}

}

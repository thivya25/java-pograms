package Assignment;

import java.util.List;
import java.util.stream.Collectors;

interface stringSpace{
	void stringSpaceoutput(String s1);
}

@FunctionalInterface
interface StringSpace{
	String addSpace(String s);
}


public class StringToCharacter {

    public static void main(String[] args) {
    	
    	stringSpace obj =(s1)->{
			String [] arr=s1.split("");
			for(String c: arr) {
				String str=c+" ";
				System.out.print(str);
				
			}
			
			
		};
		obj.stringSpaceoutput("thivya");
		StringSpace sp=(s1)->{
				 StringBuilder sb=new StringBuilder();
				 s1.chars()
				.mapToObj(c->(char)c+" ") //C 
				.forEach(sb::append);
				 return sb.toString().trim();
			 };
			 
			 System.out.println(sp.addSpace("capagemini"));
		    	
		  }
}

//
//String s1 = "Hello, world!";
//
//List<Character> charactersList = s1.stream().filter(s1->s.split("")).map(c -> c).collect(Collectors.toList());
//			
//
//
//
//for (Character character : charactersList) {
//  System.out.println(character);
//}
////

//String str = "java@program@to.com";
//
//String[] splitArray = str.split(" ");
//
//for(String value : splitArray){
//   System.out.print(value);
//}
////Initialize the String which needs to be split
//String str1 = "Enlighter";
//
////Use the Split method and store the array of Strings returned in a String array.
//String[] arr = str1.split("(?!^)");
//
////Printing the characters using for-each loop
//for(String character : arr)
// System.out.print(character + " ");
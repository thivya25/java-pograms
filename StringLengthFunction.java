package mainapppackage2;

import java.util.Scanner;
import java.util.function.Function;
@FunctionalInterface
interface Validate{
	boolean userCheck(String u,String P);
}

public class StringLengthFunction {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE STRING : ");
		String s=sc.nextLine();
		System.out.println("ENTER THE USERNAME :");
		String un="THIVYASHREE";
		String ps="Thivya@123";
		String username  =sc.nextLine();
		System.out.println("ENTER THE PASSWORD :");
		String password =sc.nextLine();
		Function<String, Integer> fob =(str)->str.length();
		int length =  fob.apply(s);
		System.out.println("LENGTH OF STRING IS : "+length);
		Function<String, String> fob2 =(str)->str.toUpperCase();
		System.out.println(" STRING TO UPPERCASE : "+fob2.apply(s));
		Function<String, String> fob1 =(str)->str.toLowerCase();
		System.out.println(" STRING TO LOWERCASE : "+fob1.apply(s));
		 
		Validate vobj =(String u,String p )->(u.equalsIgnoreCase(un) && p.equals(ps));
			if(vobj.userCheck(username, password)){
				System.out.println("USER IS VALID");
			}
			else {
				System.out.println("USER IS INVALID");
			}
			
		
	}

}

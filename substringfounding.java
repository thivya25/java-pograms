package thivyashreepackage;

import java.util.Scanner;

class InAmsterdam{
	
	String str;
	int count;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		}
	public int countAm(String str) {
		count=(str.split("am").length-1);
		
		return count;
		
		}
	}
public class substringfounding {
	String str;
	public static void main(String args[] ) throws Exception {
		InAmsterdam ob=new InAmsterdam();
		ob.input();
		int count=ob.countAm("this is am thivyam");
		System.out.println(count);
	}
	
 }

package thivyashreepackage;



import java.util.Scanner;

class Age extends Exception{
	public Age(String s) {
		super(s);
	}
}


public class AgeException {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		age = sc.nextInt();
		try {
		if(age<18) {
			throw new Age("Not Eligible for voting, age is below 18");
		}
		}catch(Age e) {
			e.printStackTrace();
		}
	}

}
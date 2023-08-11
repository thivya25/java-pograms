package code1;

import java.util.Scanner;

public class discounttt {
	String name;
	float amount,finalamount,discount;
	void userInput() {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NAME OF THE PRODUCT:");
		name=sc.next();
		System.out.println("ENTER THE PRICE:");
		amount =sc.nextFloat();
		
	}
	void conditions() {
		if(amount>0 && amount<=1000) {
			discount= amount*0.02f;
			}else if(amount>1000 && amount<=3000) {
				discount= amount*0.1f;
				}else {
					discount= amount*0.15f;
				}
		finalamount=amount-discount;
	}
	void display() {
		
		System.out.println("THE FINAL PRICE IS: "+finalamount);
		
	}

	public static void main(String[] args) {
		discounttt sc =new discounttt();
		sc.userInput();
		sc.conditions();
		sc.display();
		}

}

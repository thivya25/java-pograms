package code1;

import java.util.Scanner;

public class discountt {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER THE NAME OF THE PRODUCT:");
	String name=sc.next();
	System.out.println("ENTER THE PRICE:");
	float amount =sc.nextFloat();
	float finalamount,discount;
	if(amount>0 && amount<=10000) {
		discount= (amount*5)/100;
		}
	else if(amount>10000 && amount<=20000) {
		discount= (amount*10)/100;
		}else if(amount>20000 && amount<=35000) {
		discount= (amount*15)/100;
		}else  {
		discount= (amount*20)/100;
		}
	finalamount=amount-discount;
	System.out.println("THE AMOUNT TO BE PAID IS: "+finalamount);
}
}

package code1;

import java.util.Scanner;

public class discounttt {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NAME OF THE PRODUCT:");
		String name=sc.next();
		System.out.println("ENTER THE PRICE:");
		float amount =sc.nextFloat();
		float finalamount,discount;
		if(amount>0 && amount<=1000) {
			discount= amount*0.02f;
			}else if(amount>1000 && amount<=3000) {
				discount= amount*0.1f;
				}else {
					discount= amount*0.15f;
				}
		finalamount=amount-discount;
		System.out.println("THE FINAL AMOUNT IS: "+discount);
		System.out.println("THE FINAL AMOUNT IS: "+finalamount);
		
		
		
		// TODO Auto-generated method stub

	}

}

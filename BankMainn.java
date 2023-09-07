package thivyashreepackage;

class MyBank{
	float amt;
	public MyBank() {
		amt=1000;
	}
	synchronized void deposite(float damt) {
		System.out.println("inside deposit"+amt);
		amt=amt+damt;
		notify();
	}
	synchronized public void withdraw(float wamt) throws InterruptedException {
		if(wamt>amt) {
			System.out.println("INSUFFICENT AMOUNT NEED TO DEPOSIT FIRST");
			wait();
			amt=amt-wamt;
			System.out.println("BALANCE AFTER WITHDRAW "+ amt);
		}
		else {
			System.out.println("YOU CAN WITHDRAW "+(amt-wamt));
		}
	}
}

public class BankMainn {

	public static void main(String[] args) {
		MyBank bob=new MyBank();
		Thread tob1=new Thread() {
			public void run() {
				try {
					bob.withdraw(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		tob1.start();
		Thread tob2=new Thread() {
			public void run() {
				bob.deposite(4000);
			}
		};
		tob2.start();

	}

}

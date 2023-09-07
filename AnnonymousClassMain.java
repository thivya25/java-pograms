package thivyashreepackage;

public class AnnonymousClassMain {

	public static void main(String[] args) {
		Thread tob=new Thread() {
			public void run() {
				System.out.println("RUN METHOD "+Thread.currentThread());
			}
		};
		tob.start();
		//tob.run(); //it calls the main thread
		new Thread() {
			public void run() {
				System.out.println("RUN METHOD"+Thread.currentThread());
			}
		}.start();
	}

}

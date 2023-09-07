package thivyashreepackage;

public class Threadd extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread = "+Thread.currentThread());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException  {
		System.out.println(Thread.currentThread());
		Threadd eob= new Threadd();
		eob.run();
		eob.setName("FIRST THREAD");
		Threadd eob1= new Threadd();
		eob1.setName("SECOND THREAD");
		System.out.println("THE NAME IS "+eob.getName());
		System.out.println("FIRST IS ALLIVE "+eob.isAlive());
		System.out.println("SECOND IS ALLIVE "+eob1.isAlive());
		eob1.start();
		System.out.println("SECOND IS ALLIVE "+eob1.isAlive());
		eob1.join();
		eob.start();
		System.out.println(eob.getId());
		}

}

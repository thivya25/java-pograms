package thivyashreepackage;
class demo implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread = "+Thread.currentThread());
		}
		
	}
	
}

public class RunnableThread {

	public static void main(String[] args) {
		demo dob=new demo();
		
		Thread tob=new Thread(dob);
		tob.setName("FIRST THREAD");
		tob.setPriority(9);
		tob.start();
		demo dob1=new demo();
		Thread tob1=new Thread(dob1);
		tob1.setName("SECOND THREAD");
		tob1.start();

	}

}

package thivyashreepackage;
class MulitTable{
//	synchronized void table(int n) {
//		for(int i=1;i<=10;i++) {
//			System.out.println(n+"X"+i+"="+(n*i));
//		}
//	}
	void table(int n) 
	{
		synchronized (this)
		{
			for(int i=1;i<=10;i++)
			{
				
				System.out.println(n+"X"+i+"="+(n*i));
			}
		}
		System.out.println("ountside the block"+Thread.currentThread());

	}
}
 class MyThread1 extends Thread{
	 MulitTable t1;
	 public MyThread1(MulitTable table) {
		this.t1=table;
	}

	public void run() {
		 t1.table(2);
	 }
 }
 class MyThread2 extends Thread{
	 MulitTable t2;
	 public MyThread2(MulitTable table) {
		this.t2=table;
	}

	public void run() {
		 t2.table(5);
	 }
 }
public class SnychronicedMain {

	public static void main(String[] args) {
		MulitTable table =new MulitTable();
		MyThread1 tob1=new MyThread1(table);
		tob1.start();
		
		MyThread2 tob2=new MyThread2(table);
		tob2.start();

	}

}

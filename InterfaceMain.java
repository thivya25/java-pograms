package thivyashreepackage;


//interface contains public abstract methods
//variables are public final and static
interface MyInt{
	int val=10; //by default public static final int val=10;
	void m1();  //by default public abstract void m1();
	void m2();  //by default public abstract void m2();
	void m3();   //by default public abstract void m2();
	//methods don't have body,constructor,normal variables
}

class EduClass implements MyInt{
	//override methods of interface
	public  void m1() { //public is mandatory bzc interface method are public by default
		System.out.println("m1 method");
	}
	public void m2() {
		System.out.println("m2 method");
	}
	public void m3() {
		System.out.println("m3 method");
	}
}

public class InterfaceMain {

	public static void main(String[] args) {
		EduClass eob = new EduClass();
		 eob.m1();
		 eob.m2();
		 eob.m3();

	}

}

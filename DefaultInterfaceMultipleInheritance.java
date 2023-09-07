package mainapppackage1;
interface intf1{
	void m1();
	default void m2() {
		System.out.println("default methode");
	}
}
interface intf2{
	void m3();
	default void m2() {
		System.out.println("default methode");
	}
}
class ImpClass implements intf1,intf2{

	@Override
	public void m3() {
		System.out.println("m3");
		
	}

	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		intf1.super.m2();
		intf2.super.m2();
	}
	
	
	
	
}
public class DefaultInterfaceMultipleInheritance {

	public static void main(String[] args) {
		ImpClass obj= new ImpClass();
		obj.m1();
		obj.m3();
		obj.m2();
		

	}

}

package thivyashreepackage;


interface CalcI{
	double PI_VALUE = 3.14;
	void add(int num1, int num2);
	void sub(int num1, int num2);
	void mul(int num1, int num2);
	void div(int num1, int num2);
	
}

class Calc implements CalcI{
	public void add(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+ " is: "+(a+b));
	}
	public void sub(int a, int b) {
		System.out.println("Substraction of "+a+" and "+b+ " is: "+(a-b));
	}
	public void mul(int a, int b) {
		System.out.println("Multiplication of "+a+" and "+b+ " is: "+(a*b));
	}
	@Override
	public void div(int a, int b) {
		System.out.println("Division of "+a+" and "+b+ " is: "+(a/b));
		
	}
}

interface Printer{
	void print();
	default void scan() {
		System.out.println(" SCAN SERVICE ");
	}
	static void colourPrint() {
		System.out.println("COLOUR PRINT");
	}
}

class CanonPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("PRINTING USING CANON PRINTER");
	}	
}

class EpsonPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("PRINTING USING EPSON PRINTER");
	}
	
	@Override
	public void scan() {
		System.out.println("SCANNING USING EPSON PRINTER");
	}
}
@FunctionalInterface
interface MyInterface{
	void m1();
	//void m2();
}

interface A{
	int i = 10;
	
}
interface B{
	int i = 100;
}
interface C extends B{
	
}
interface ABC extends A,B,C{
	
}
class X {
	
}
class Y {
	
}
class XY extends X implements A,B{
	
}

class NewC implements A,B {
	
}
public class MainAppTest {

	public static void main(String[] args) {
//		Calc c = new Calc();
//		c.add(2, 8);
//		c.sub(2, 8);
//		c.mul(2, 8);
//		c.div(2, 8);
		EpsonPrinter ep = new EpsonPrinter();
		System.out.println(ep);
		ep.scan();
		ep.print();
		Printer.colourPrint();
		NewC ne = new NewC();
		System.out.println(A.i);
		System.out.println(B.i);

	}

}

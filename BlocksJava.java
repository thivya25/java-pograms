package thivyashreepackage;



public class BlocksJava {
	static {
		System.out.println("static block will executes before the main");
	}
	{
	
		System.out.println("annonymous block , executes after main , on object creation before constructor");
	} //it is only call when object is created
	public BlocksJava(){
		System.out.println("constuctor");
	}
	
	static void display() {
		System.out.println("display method");
	} //static method belong to class
	public static void main(String[] args) {
		 System.out.println("main");
		 BlocksJava ob = new BlocksJava();
		// ob.display();
		 BlocksJava.display();//to call static method when static was in different class
		  display();//to call static method when static was in same class
//static can be used for common data,initaized inside with static or class and can be used anywhere to save 
//eg clg name,company name,contry name this is static variable 
	}

}

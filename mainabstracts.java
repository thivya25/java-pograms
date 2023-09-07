package thivyashreepackage;



abstract class Shapes{
   //abstract void area();
	 int i;
	 
	 Shapes(){
		 
	 }
	abstract void area() ;
  void display(){
          System.out.println("Display parent shape");
  }
}

abstract class Triangles extends Shapes{

	
     
	void display(){
       System.out.println("Display child");
}
	
}

class MyClass extends Triangles{

	@Override
	void area() {
		// TODO Auto-generated method stub
		
	}
	
}
public class mainabstracts {
public static void main(String[] args) {
//	Shape sob=new Shape();//no object for abstract
	MyClass tob=new MyClass();
	tob.area();
	tob.display();
}
}

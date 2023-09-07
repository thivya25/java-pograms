package thivyashreepackage;


class Parents{
	void add(){
		System.out.println("add of parent");
		}
	}

		class Childs extends Parents{
		 public void add(){
			 super.add();
		     System.out.println("add of Child");
		   }
		}
public class checkexample 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childs d=new Childs();
		d.add();
		

	}


}
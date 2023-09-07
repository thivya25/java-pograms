package thivyashreepackage;

import java.util.Scanner;

class products{
	int id;
	String name;
	
	public products(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	void dispaly() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	@Override
	public String toString() {
		return "products [id=" + id + ", name=" + name + "]";
	}

}

public class constructoress {

	public static void main(String[] args) {
		products sob=new products(23,"thivya");
		System.out.println(sob);
		sob.dispaly();
		}

	
}

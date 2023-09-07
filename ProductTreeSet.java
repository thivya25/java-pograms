package mainapppackage2;


import java.util.Comparator;
import java.util.TreeSet;


class Product{
	private int pid;
	private String pname;
	private float price;
	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
class SortProductId implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPid()>p2.getPid()) 
			return 1;
		
		else if(p1.getPid()<p2.getPid()) 
			return -1;
		return 0;
		
	}
	
}
class SortProductPrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		if(p1.getPrice()>p2.getPrice()) 
			return 1;
		else if(p1.getPrice()<p2.getPrice())
			return -1;
		return 0;
	}
	
}
class SortProductname implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getPname().compareTo(p2.getPname());
	}
	
}


public class ProductTreeSet {

	public static void main(String[] args) {
		SortProductId t1=new SortProductId();
		TreeSet<Product> hobj=new TreeSet<Product>(t1);
		Product p1= new Product(4,"TV",23455);
		Product p2= new Product(2,"MOBILE",12345);
		Product p3= new Product(1,"LAPTOP",89345);
		Product p4=new Product(3,"TAB",78345);
		hobj.add(p1);
		hobj.add(p2);
		hobj.add(p3);
		hobj.add(p4);
		System.out.println(hobj);

	}
}




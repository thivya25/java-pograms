package mainapppackage1;
@FunctionalInterface
interface message{
	void display();
}
@FunctionalInterface
interface subraction{
	void sub(int a,int b);
}


@FunctionalInterface
interface addition{
	int sum(int a,int b);
}


public class LambdaExpressionExample {

	public static void main(String[] args) {
		//no argument and no return type
		//lambda expression has only one fuctional interface
		//
		message obj =()->{
			System.out.println("hi");
		};
		obj.display();
		message obj1=()->System.out.println("hi");
		obj1.display();
		subraction sob=(a,b)->{
			System.out.println(a-b);
		};
		sob.sub(6, 3);
		addition obj2=(int a,int b)->{
			int k=a+b;
			
			return k;
		};
		System.out.println(obj2.sum(2, 3));
		addition obj3=(i,j)->(i+j);
		System.out.println(obj3.sum(5, 6));
	
	}

}

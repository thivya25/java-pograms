package thivyashreepackage;

public class division {
	public static void main(String args[]){
		int a=10, b=0, c=0;
		int arr[]=new int[3];
	     System.out.println("Before division");
	     try {
	    	 c=a/b; 
	     }catch(ArithmeticException e) {
	    	 System.out.println("divisor is zero"+e);
	     }
	     
	     System.out.println("After division"+c);
	     try {
	    	 arr[5]=3;
	    	 }
	     catch(ArrayIndexOutOfBoundsException e)
	     {
	    	 e.printStackTrace();
	    }
	     
	     finally {
	    	 System.out.println("finally block");
	     }
	}
}



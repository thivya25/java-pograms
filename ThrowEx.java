package thivyashreepackage;

public class ThrowEx {

	public static void main(String[] args) {
		int a=10, b=0, c=0;
       
        
          System.out.println("Before division");
          try {
            
        	  if(b==0) {
        		  throw new ArithmeticException("Denominator is zero");
        	  }else {
        		  c=a/b;
        	  }
             
          }catch(ArithmeticException e) {
        	  e.printStackTrace();
          }
	}

}
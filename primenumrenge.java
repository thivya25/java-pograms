package code1;

public class primenumrenge{
	
	public static void main(String[] args) {
		int c;
		for(int i=1;i<100;i++) 
		{
			c=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0) 
				{
					c++;
				}
				
			}if(c==2) {
				System.out.println("the primenum is"+i);
			}
			
			
		}
	}
	

}

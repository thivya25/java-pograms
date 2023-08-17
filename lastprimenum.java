package code1;

public class lastprimenum {
	
	public static void main(String[] args) {
		int c=0,cn=0;
		for(int i=100;i>=1;i--) {
			c=0;
			for(int j=1;j<=100;j++) {
				if(i%j==0) {
					c++;
				}
			}
			if(c==2) {
				cn++;
				System.out.println(i);
				if(cn==3) {
					break;
				}
			}
		}
	}

}

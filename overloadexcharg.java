package thivyashreepackage;
class display{
	void dis(int i,float j) {
		System.out.println("THE INT VALUE IS: "+i+" THE FLOAT VALUE IS: "+j);
	}
	void dis(float i,int j) {
		System.out.println("THE INT VALUE IS: "+j+" THE FLOAT VALUE IS: "+i);
	}
	
}

public class overloadexcharg {

	public static void main(String[] args) {
		display sob=new display();
		sob.dis(24, 24.5f);
		sob.dis(26.7f, 26);

	}

}

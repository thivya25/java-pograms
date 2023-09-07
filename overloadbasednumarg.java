package thivyashreepackage;
class displays{
	void dis(float i) {
		System.out.println("THE FLOAT VALUE1 IS : "+i);
	}
	void dis(float i,float j) {
		System.out.println("THE FLOAT VALUE1 IS : "+i+" THE FLOAT VALUE2 IS : "+j);
	}
	void dis(float i,float j,int k) {
		System.out.println("THE FLOAT VALUE1 IS : "+i+" THE FLOAT VALUE2 IS : "+j+" THE INTERGER VALUES IS : "+k);
	}
}

public class overloadbasednumarg {

	public static void main(String[] args) {
		displays sob=new displays();
		sob.dis(1.02f);
		sob.dis(2.34f, 4.56f);
		sob.dis(4f, 6.12f, 5);

	}

}

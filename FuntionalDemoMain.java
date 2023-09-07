package mainapppackage2;

//String str="CAPGEMINI"->INPUT
//C A P G E M I N I->OUTPUT
//
//Using Lambda Expression

interface stringSpace{
	void stringSpaceoutput(String s1);
}

public class FuntionalDemoMain {

	public static void main(String[] args) {
		
		stringSpace obj =(s1)->{
			String [] arr=s1.split("");
			for(String c: arr) {
				System.out.print(c+" ");
			}
		};
		
		
		obj.stringSpaceoutput("thivya");
		
	}

}

package code1;

public class whileamstrorange{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,amg=0,rem,orgnum;
		for(int i=1;i<=1000;i++)
		{
			orgnum=i;
			num=i;
			amg=0;
			while(num!=0){
			rem=num%10;
			amg=amg+(rem*rem*rem);
			num=num/10;
			}
			if(orgnum==amg)
			{
				System.out.println("num "+amg);
			}
		}
	}
}

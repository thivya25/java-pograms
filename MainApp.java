package mainapppackage1;

import mainapppackage2.HR;

//default, protected, public
class Employee{
		private int i;
		
		private void empPersonalDetails() {
			System.out.println("empPersonalDetails");
		}
		protected void display() {
			System.out.println("display method "+i);
			empPersonalDetails();
		}
}
class Employees extends HR
{
	private int i;
	
	private void empPersonalDetails()
	{
		System.out.println("empPersonalDetails");
	}
	public void display() 
	{
		System.out.println("display method "+id);
		System.out.println("display method "+name);
		
		empPersonalDetails();
	}
}


	public class MainApp {

		public static void main(String[] args) 
		{
			Employees eob = new Employees();
			eob.input();
			eob.display();
			
//			HR hob=new HR();
//			hob.input();
//		     hob.display();

		}
		

}

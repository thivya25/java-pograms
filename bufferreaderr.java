package code1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreaderr {
	public static void main(String[]args) throws NumberFormatException, IOException {
		int sid;
		String sname;
		float sfee;
		InputStreamReader is =new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(is);
		System.out.println("ENTER STUDENT ID:");
		sid=Integer.parseInt(br.readLine());
		System.out.println("ENTER NAME");
		sname=br.readLine();
		System.out.println("ENTER FEES:");
		sfee=Float.parseFloat(br.readLine());
		System.out.println("STUDENT DEATILS:");
		System.out.println("STUDENT ID:"+"   "+sid);
		System.out.println("STUDENT name:"+" "+sname);
		System.out.println("STUDENT FEE:"+"  "+sfee);
		
		
		
		
	}
	

}

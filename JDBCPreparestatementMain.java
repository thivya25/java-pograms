package com.edu;

import java.sql.SQLException;
import java.util.Scanner;

public class JDBCPreparestatementMain {

	public static void main(String[] args) throws SQLException {
		int select;
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("*****menu******");
			System.out.println("1.display record");
			System.out.println("2.update record");
			System.out.println("3.delete record");
			System.out.println("4.insert record");
			select=sc.nextInt();
			
			 switch(select){
				 
				 case 1:DataBaseConnectionPrepared.displayrecord();
				 break;
				 case 2:DataBaseConnectionPrepared.addrecord();
				 break;
				 case 3:DataBaseConnectionPrepared.deleterecord();
				 break;
				 case 4:DataBaseConnectionPrepared.insertrecord();
				 break;
			 }
			 System.out.println("do you want to continue y to continue,any other key to stop");
			 char choice=sc.next().toLowerCase().charAt(0);
			 if(choice!='y' ) {
				 break;
			 }
			 else {
				 continue;
			 }
			
		}
		
			 

	}

}

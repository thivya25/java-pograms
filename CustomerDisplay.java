package onlinefoodorder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDisplay {
	private static Connection con =null;
	private static String s=null;
	private static ResultSet rs=null;
	private static Scanner sc=null;
	private static PreparedStatement pst = null;
	private static String category,foodname;
	private static int quantity,i;
	
	public static void displayitem() throws SQLException {
		con=DatabaseConnection.getConnection();
		 s="select * from menuitems";
		 pst=con.prepareStatement(s);
		 rs=pst.executeQuery();
		 System.out.println("Serial No  |  Category       |  Food Name                     |  Price");
		 while(rs.next()) {
			 System.out.println(String.format("%-10d | %-15s | %-30s | %-6.2f",
			            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4))); 
	 }
	}

	public static void searchitembycategory() throws SQLException {
		con=DatabaseConnection.getConnection();
		sc=new Scanner(System.in);
		System.out.println("enter category to search");
		category=sc.nextLine();
		s=" select * from menuitems where category=?";
		pst=con.prepareStatement(s);
		pst.setString(1, category);
		rs=pst.executeQuery();
		List<String> resultsList = new ArrayList<>(); // List to store the results

		while (rs.next()) {
		    String result = String.format("%-10d | %-15s | %-30s | %-6.2f",
		            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
		    resultsList.add(result); // Add each result to the list
		}

		if (!resultsList.isEmpty()) {
		    System.out.println("Serial No  |  Category       |  Food Name                     |  Price");
		    for (String result : resultsList) {
		        System.out.println(result); // Print all results from the list
		    }
		} else {
		    System.out.println("No items found in the specified category.");
		}}
		


	public static void searchitembyfoodname() throws SQLException {
		con=DatabaseConnection.getConnection();
		sc=new Scanner(System.in);
		System.out.println("enter the foodname");
		foodname=sc.nextLine();
		s="select * from menuitems where foodname=?";
		pst=con.prepareStatement(s);
		pst.setString(1, foodname);
		rs=pst.executeQuery();
		List<String> resultsList = new ArrayList<>(); 

		while (rs.next()) {
		    String result = String.format("%-10d | %-15s | %-30s | %-6.2f",
		            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4));
		    resultsList.add(result); 
		}

		if (!resultsList.isEmpty()) {
		    System.out.println("Serial No  |  Category       |  Food Name                     |  Price");
		    for (String result : resultsList) {
		        System.out.println(result); 
		    }
		} else {
		    System.out.println("No items found in the specified category.");
		}}
		

	public static void placeorder() throws SQLException {
		con=DatabaseConnection.getConnection();
		sc=new Scanner(System.in);
		s="select * from menuitems";
		 pst=con.prepareStatement(s);
		 rs=pst.executeQuery();
		 System.out.println("Serial No  |  Category       |  Food Name                     |  Price");
		 while(rs.next()) {
			 System.out.println(String.format("%-10d | %-15s | %-30s | %-6.2f",
			            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4))); 
		 }
		 while(true) {
			
			System.out.println("enter the foodname");
			foodname=sc.nextLine();
			System.out.println("enter the quantity");
			quantity=sc.nextInt();
			s="insert into orders(foodname,price) select foodname,price from menuitems where foodname=?";
			pst=con.prepareStatement(s);
			pst.setString(1, foodname);
			  i=pst.executeUpdate();
			
			if(i>0){
				s="update orders set quantity=?,total=price*?  where foodname=?";
				pst=con.prepareStatement(s);
				pst.setFloat(1, quantity);
				pst.setFloat(2, quantity);
				pst.setString(3, foodname);
				 i=pst.executeUpdate();
				}else {
			System.out.println("foodname not found");
		}
		System.out.println("do you want to continue y to continue,any other key to place the order");
		char choice=sc.next().toLowerCase().charAt(0);
		sc.nextLine();
		if(choice!='y' ) {
			
			s="select * from orders";
			pst=con.prepareStatement(s);
			rs=pst.executeQuery();
			System.out.println("Serial No  |  Food Name           |  Quantity   |  Price     |  Total");
			System.out.println("-----------------------------------------------------------------------");

			while(rs.next()) {
				
				System.out.println(String.format("%-10d | %-20s | %-11.5s | %-10.2f |%-10.2f",
			            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4),rs.getFloat(5))); 
			}
			System.out.println("-----------------------------------------------------------------------");
			s="select sum(total)  from orders";
			pst=con.prepareStatement(s);
			rs=pst.executeQuery();
			while(rs.next()) {
				float total=rs.getFloat(1);
				if(total>=1000 && total<2000) {
					System.out.println("TOTAL = "+total+"\nDISCOUNT =100");
					System.out.println("---------\nTOTAL ="+(total-100)+"\n---------");
				}else if(total>=2000 && total<3000) {
					System.out.println("TOTAL = "+total+"\nDISCOUNT =250");
				System.out.println("---------\nTOTAL ="+total+"\n---------");}
				else if(total>=3000){
					System.out.println("TOTAL = "+total+"\nDISCOUNT =350");
					System.out.println("---------\nTOTAL ="+total+"\n---------");
				}
				else {
					System.out.println("---------\nTOTAL ="+total+"\n---------");
				}
			}
			
			s="truncate orders";
			pst=con.prepareStatement(s);
			 i=pst.executeUpdate();
			break;
			}else {
				continue;
			 }
		}
		
		 
	}
}


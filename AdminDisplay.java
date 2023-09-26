package onlinefoodorder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDisplay {
	private static Connection con=null;
	private static PreparedStatement pst=null;
	private static ResultSet rs=null;
	private static String s,category,foodname;
	private static int i,serialno,choice,sno=0;
	private static float price;
	private static Scanner sc=new Scanner(System.in);
	
public static void displayitem() throws SQLException {
		con=DatabaseConnection.getConnection();
		s="select * from menuitems order by category desc ";
		pst=con.prepareStatement(s);
		rs=pst.executeQuery();
		System.out.println("Serial No  |  Category       |  Food Name                     |  Price");
		 while(rs.next()) {
			 System.out.println(String.format("%-10d | %-15s | %-30s | %-6.2f",
			            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4))); 
	 }
	}

	public static void insertitems() throws SQLException {
		con=DatabaseConnection.getConnection();
		s="select max(sno)+1 as serialnumber from menuitems";
		pst=con.prepareStatement(s);
		rs=pst.executeQuery();
		try {
		if(rs.next()) {
			sno=rs.getInt("serialnumber");
		}
		System.out.println("enter category");
		category=sc.nextLine();
		System.out.println("enter food name");
		foodname=sc.nextLine();
		System.out.println("enter price");
		price=sc.nextFloat();
		s="insert into menuitems values (?,?,?,?)";
		pst=con.prepareStatement(s);
		pst.setInt(1, sno);
		pst.setString(2, category);
		pst.setString(3, foodname);
		pst.setFloat(4, price);
		i=pst.executeUpdate();
		if(i>0) {
			System.out.println("Inserted Sucessfully");
		}else {
			System.out.println("Error");
		}}
		catch(Exception e) {
			System.out.println("COLUMN NAME SHOULD NOT BE EMPTY");
		}
	}

	public static void updateitems() throws SQLException {
		
		while(true) {
			con=DatabaseConnection.getConnection();
			System.out.println("enter the column name to updated\n 1.category \n 2.food name\n3. price\n ");
			choice=sc.nextInt();
			sc.nextLine();
			int sno;
			switch(choice) {
			case 1:
				System.out.println("enter new category name");
				 category=sc.next();
				sc.nextLine();
				System.out.println("enter serial number");
				 sno=sc.nextInt();
				s="update  menuitems set category=? where sno=?";
				pst=con.prepareStatement(s);
				pst.setString(1, category);
				pst.setInt(2, sno);
				i=pst.executeUpdate();
				if(i>0) {
					System.out.println("Updated Sucessfully");
				}else {
					System.out.println("Error");
				}
				break;
			case 2:
				System.out.println("enter new food name");
				foodname=sc.next();
				sc.nextLine();
				System.out.println("enter serial number");
				 sno=sc.nextInt();
				s="update menuitems set foodname=? where sno=?";
				pst=con.prepareStatement(s);
				pst.setString(1, foodname);
				pst.setInt(2, sno);
				i=pst.executeUpdate();
				if(i>0) {
					System.out.println("Updated Sucessfully");
				}else {
					System.out.println("Error");
				}
				break;
			case 3:
				System.out.println("enter new price");
				price=sc.nextInt();
				System.out.println("enter serial number");
				sno=sc.nextInt();
				s="update  menuitems set price=? where sno=?";
				pst=con.prepareStatement(s);
				pst.setFloat(1, price);
				pst.setFloat(2, sno);
				i=pst.executeUpdate();
				if(i>0) {
					System.out.println("Updated Sucessfully");
				}else {
					System.out.println("Error");
				}break;
			}
				System.out.println("do you want to continue y to continue,any other key to stop");
				char choice=sc.next().toLowerCase().charAt(0);
				if(choice!='y' ) {
					
					break;
					}else {
						sc.nextLine();
						continue;
					 }
			
			}
		}
		
	

	public static void removeitems() throws SQLException {
		con=DatabaseConnection.getConnection();
		System.out.println("enter serialno ");
		serialno=sc.nextInt();
		s="delete from menuitems where sno=? ";
		pst=con.prepareStatement(s);
		pst.setInt(1, serialno);
		if(i>0) {
			System.out.println("Deleted Sucessfully");
		}else {
			System.out.println("Error");
		}
		
		
	}

}

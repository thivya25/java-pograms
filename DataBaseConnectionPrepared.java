package com.edu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseConnectionPrepared {
	private static Connection con;
	private static String s;
	private static ResultSet rs;
	private static Scanner sc;
	private static String email,pass;
	private static PreparedStatement pst;

	
		public static void displayrecord() throws SQLException {
			con=DatabaseConnection.getConnetction();
			 Statement st = con.createStatement();
			 s="select * from login";
			 pst=con.prepareStatement(s);
			 ResultSet rs=pst.executeQuery();
			 System.out.println("emailid\t  password");
			 while(rs.next()) {
					System.out.println(rs.getString(1)+"   "+rs.getString(2));
			 }
			
		}

	
		public static void addrecord() throws SQLException {
			con=DatabaseConnection.getConnetction();
			
			 sc=new Scanner(System.in);
			 System.out.println("Enter email id");
				 email=sc.next();
			  s="select * from login where emailid=?";
			  PreparedStatement pst =con.prepareStatement(s);
			  pst.setString(1, email);
				 rs = pst.executeQuery();
				if(rs.next()) {
					
					sc=new Scanner(System.in);
					System.out.println("enter the password to be updated");
					String pass=sc.next();
					 s="update login set password=? where emailid=?";
					 PreparedStatement pst1 =con.prepareStatement(s);
					  pst1.setString(1, pass);
					  pst1.setString(2, email);
						int i1 = pst1.executeUpdate();
					
					
					if(i1>0) {
						System.out.println("updated");
					}
					else {
						System.out.println("error");
					}
					
				}else {
					System.out.println("User not exists with email id ="+email);
				}
			 
		}

		public static void deleterecord() throws SQLException {
			con=DatabaseConnection.getConnetction();
			 Statement st = con.createStatement();
			sc=new Scanner(System.in);
			 System.out.println("email id");
			 email=sc.next();
			  s="select * from login where emailid=?";
			  pst =con.prepareStatement(s);
			  pst.setString(1, email);
				rs = pst.executeQuery();
				
				if(rs.next()) {
					//System.out.println("user exists with email id "+rs.getString("emailid"));
					
					s="delete from login where emailid=?";
					 pst =con.prepareStatement(s);
					  pst.setString(1, email);
					  int i = pst.executeUpdate();
					
					
					if(i>0) {
						System.out.println("deleted");
					}
					else {
						System.out.println("error");
					}
					
				}else {
					System.out.println("User not exists with email id ="+email);
				}
			
		}

		public static void insertrecord() throws SQLException {
			con=DatabaseConnection.getConnetction();
			
			sc=new Scanner(System.in);
			 System.out.println("email id");
			 email=sc.next();
			 s="select * from login where emailid=?";
			 pst =con.prepareStatement(s);
			  pst.setString(1, email);
				rs = pst.executeQuery();
			
			 if(!rs.next()) {
				 
				 System.out.println("enter new password");
				 pass=sc.next();
				 s="insert into login values(?,?)";
				 pst =con.prepareStatement(s);
				  pst.setString(1, email);
				  pst.setString(2, pass);
				 int i=pst.executeUpdate();
				 if(i>0) {
					 System.out.println("registered sucessfully");
				 }else {
					 System.out.println("error orrured");
				 }
				 
			 }else {
				 System.out.println(email+"already exists");
			 }
			
		}

	
}

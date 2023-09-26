package com.edu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseOperation {
	private static Connection con;
	private static String s;
	private static ResultSet rs;
	private static Scanner sc;
	private static String email,pass;
	
	public static void displayrecord() throws SQLException {
		con=DatabaseConnection.getConnetction();
		 Statement st = con.createStatement();
		 s="select * from login";
		 ResultSet rs=st.executeQuery(s);
		 System.out.println("emailid\t  password");
		 while(rs.next()) {
				System.out.println(rs.getString(1)+"   "+rs.getString(2));
		 }
		
	}

	public static void addrecord() throws SQLException {
		con=DatabaseConnection.getConnetction();
		 Statement st = con.createStatement();
		 sc=new Scanner(System.in);
		 System.out.println("Enter email id");
			 email=sc.next();
		  s="select * from login where emailid='"+email+"'";
			rs = st.executeQuery(s);
			if(rs.next()) {
				//System.out.println("user exists with email id "+rs.getString("emailid"));
				sc=new Scanner(System.in);
				System.out.println("enter the password to be updated");
				String pass=sc.next();
				
				 s="update login set password='"+pass+"' where emailid='"+email+"'";
				
				int i=st.executeUpdate(s);
				if(i>0) {
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
		  s="select * from login where emailid='"+email+"'";
			rs = st.executeQuery(s);
			if(rs.next()) {
				//System.out.println("user exists with email id "+rs.getString("emailid"));
				
				s="delete from login where emailid='"+email+"'";
				
				int i=st.executeUpdate(s);
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

	public static String insertrecord() throws SQLException {
		con=DatabaseConnection.getConnetction();
		 Statement st = con.createStatement();
		sc=new Scanner(System.in);
		 System.out.println("email id");
		 email=sc.next();
		 s="select * from login where emailid='"+email+"'";
		 ResultSet rs=st.executeQuery(s);
		 if(!rs.next()) {
			 
			 System.out.println("enter new password");
			 pass=sc.next();
			 s="insert into login values('"+email+"','"+pass+"')";
			 int i=st.executeUpdate(s);
			 if(i>0) {
				 System.out.println("registered sucessfully");
			 }else {
				 System.out.println("error orrured");
			 }
			 
		 }else {
			 System.out.println(email+"already exists");
		 }
		return null;
	}

}

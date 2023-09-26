package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/10224_10225_db";
		String un="root";
		String pass="toor";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		
		try {
		
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,un,pass);
			
			stmt = conn.createStatement();
			System.out.println("Enter email id");
			String em=sc.next();
			
			String s="select * from login where emailid='"+em+"'";
			rs = stmt.executeQuery(s);
			if(rs.next()) {
				int i=stmt.executeUpdate(s);
				if(i>0) {
					System.out.println("email is present");
				}
				else {
					
					String del ="delete from login where emailid='"+em+"'";
					stmt.executeUpdate(del);

				}
				
			}else {
				System.out.println("User not exists with email id ="+em);
			}
			
//			System.out.println("enter emailid and password to insert");
//			String em2=sc.next();
//			String pass2=sc.next();
//			String ins="insert into login values('"+em+"','"+pass2+"')";
//			stmt.executeUpdate(ins);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

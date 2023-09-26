package com.edu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GetRecordUsingEmail {

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
					//load the driver
					Class.forName(driver);
					//Make the connection
					conn = DriverManager.getConnection(url,un,pass);
					//create a Statement
					stmt = conn.createStatement();
					System.out.println("Enter email id");
					String em=sc.next();
					//select * from login where emailid='admin@gmail.com'
					String s="select * from login where emailid='"+em+"'";
					rs = stmt.executeQuery(s);
					if(rs.next()) {
						//System.out.println("user exists with email id "+rs.getString("emailid"));
						System.out.println("enter the password to be updated");
						String pass1=sc.next();
						
						String s1="update login set password='"+pass1+"' where emailid='"+em+"'";
						
						int i=stmt.executeUpdate(s1);
						if(i>0) {
							System.out.println("updated");
						}
						else {
							System.out.println("error");
						}
						
					}else {
						System.out.println("User not exists with email id ="+em);
					}
//					System.out.println("enter mailid to delete");
//					String em1=sc.next();
//					String del ="delete from login where emailid='"+em1+"'";
//					stmt.executeUpdate(del);
					System.out.println("enter emailid and password to insert");
					String em2=sc.next();
					String pass2=sc.next();
					String ins="insert into login values('"+em+"','"+pass2+"')";
					stmt.executeUpdate(ins);
				}catch(Exception e) {
					e.printStackTrace();
				}
				

			}

		

	}



package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserLoginDetails {

	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/10224_10225_db";
		String un="root";
		String pass="toor";
		// TODO Auto-generated method stub
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pass);
			if(con!=null) {
				System.out.println("connceted");
				Statement st=con.createStatement();//while importing we have to import sql.statement
				String sql="select * from login";
				ResultSet rs=st.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getString("emailid")+" "+rs.getString("password"));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

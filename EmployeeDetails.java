package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDetails {

	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/thivyadb";
		String un="root";
		String pass="toor";
		// TODO Auto-generated method stub
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, un, pass);
			if(con!=null) {
				System.out.println("connceted");
				Statement st=con.createStatement();//while importing we have to import sql.statement
				String sql="select * from department";
				ResultSet rs=st.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}

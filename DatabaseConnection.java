package onlinefoodorder;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/onlinefoodorder";
	private static String un="root";
	private static String pass="toor";
	private static Connection con;
	
	public static Connection getConnection() {
				try {
					Class.forName(driver);
					if(con==null)
					con=DriverManager.getConnection(url, un, pass);
				}catch(Exception e) {
					e.printStackTrace();
				}
				return con;
				
	}

}

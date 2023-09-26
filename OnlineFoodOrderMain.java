package onlinefoodorder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class OnlineFoodOrderMain {
	
	public static void main(String[] args) throws SQLException {
		Connection con=null ;
		String s;
		ResultSet rs=null;
		PreparedStatement pst;
		Scanner sc = new Scanner(System.in);
		String username,emailid ,password;
		int mobilenumber;

		boolean isLogged = false;
		do {
			
			con=DatabaseConnection.getConnection();
			System.out.println("1.Register\n2.Login\n");
			System.out.println("ENTER YOUR CHOICE : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("ENTER THE USERNAME : ");
				username=sc.nextLine().toUpperCase();
				System.out.println("ENTER YOUR EMAIL ID : ");
				emailid=sc.nextLine();
				System.out.println("ENTER YOUR PASSWORD : ");
				password=sc.nextLine();
				System.out.println("ENTER YOUR MOBILE NUMBER : ");
				mobilenumber=sc.nextInt();
				
				try {
				s="insert into login values(?,?,?,?)";
				pst=con.prepareStatement(s);
				pst.setString(1, username);
				pst.setString(2, emailid);
				pst.setString(3, password);
				pst.setInt(4, mobilenumber);
				int i=pst.executeUpdate();
				if(i>0) {
				System.out.println("Registration successful");
				break;
				}
				
				}catch(Exception e) {
					System.out.println("email id already exist,please register new emailId or login with emailId");
					break;
				}
			case 2:
				System.out.println("ENTER THE EMAIL ID : ");
				emailid = sc.nextLine();
				System.out.println("ENTER THE PASSWORD : ");
				password = sc.nextLine();
				
				try {
					String username1=null;
					int mno=0;
					s="select * from login where emailid=? and password=?";
					pst=con.prepareStatement(s);
					pst.setString(1, emailid);
					pst.setString(2, password);
					rs=pst.executeQuery();
					if((emailid.equals("admin@gmail.com")) && (password.equals("admin"))) 
					{
						System.out.println("hi admin");
						int select;
						Scanner sc1 =new Scanner(System.in);
						while(true) {
							System.out.println("*****menu******");
							System.out.println("1.display items");
							System.out.println("2.insert into table");
							System.out.println("3.update table");
							System.out.println("4.delete items from table");
							select=sc1.nextInt();
							switch(select) {
							case 1:AdminDisplay.displayitem();
							break;
							case 2:AdminDisplay.insertitems();
							break;
							case 3:AdminDisplay.updateitems();
							break;
							case 4:AdminDisplay.removeitems();
							break;
							}
							System.out.println("do you want to continue y to continue,any other key to stop");
							char choice1=sc1.next().toLowerCase().charAt(0);
							if(choice1!='y' ) {
								System.out.println("Exiting");
								System.exit(0);
								break;
								}else {
									continue;
								 }
								}sc1.close();
						}
					else if(rs.next()){
						
						s="select username as un ,mobilenumber as mnom from login where emailid=?";
						pst=con.prepareStatement(s);
						pst.setString(1,emailid);
						rs=pst.executeQuery();
						if(rs.next()) {
							 username1=rs.getString("un");
							 mno=rs.getInt("mnom");
							
						}
						
						System.out.println("WELCOME TO HUNGRY FOOD'S "+username1 );						
						int select;
						Scanner sc1 =new Scanner(System.in);
						while(true) {
							try {
							System.out.println("*****menu******");
							System.out.println("1.display items");
							System.out.println("2.search item by category");
							System.out.println("3.search item by foodname");
							System.out.println("4.place order");
							select=sc1.nextInt();
							switch(select) {
							case 1:CustomerDisplay.displayitem();
							break;
							case 2:CustomerDisplay.searchitembycategory();
							break;
							case 3:CustomerDisplay.searchitembyfoodname();
							break;
							case 4:CustomerDisplay.placeorder();
							System.out.println("THANK YOU FOR ORDERING");
							System.out.println("NAME: "+username1+"\nMOBILENUMBER: "+mno);
							System.exit(0);
							break;
							}
							System.out.println("do you want to continue y to continue,any other key to stop");
							char choice1=sc1.next().toLowerCase().charAt(0);
							if(choice1!='y' ) {
								System.out.println("Exiting");
								System.exit(0);
								break;
								}else {
									continue;
								 }
							}catch(Exception e) {
								System.out.println("PLEASE ENTER THE CORRECT CHOICE");
							}sc1.close();
							}
					}else{
						System.out.println("Please check with emailid and password and  Try again \n");
						break;
						}
				}
				
				catch(Exception e) {
					System.out.println("Invalid Credentials Please Try Again\n");
				}
				break;
			   
			    
			default:
				System.out.println("*****Invalid Choice !!! Please try again*****");
				break;
			}
			
		}while(!isLogged);
	
sc.close();
	}
}



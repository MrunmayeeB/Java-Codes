import java.sql.*;
import java.io.*;

class JdbcDemo{
	public static void main(String args[]){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql:employee","root","root");
			if(con == null)
			{
				System.out.println("Connection Failed");
			}
			else 
			{
				System.out.println("Connection Success");
				stmt=con.createStatement();
				rs = stmt.executeQuery("Select * from emp");
				{
					while(rs.next())
					{
						System.out.println("EmpNo:"+rs.getInt(1));
						System.out.println("EmpName:"+rs.getString(2));
						System.out.println("EmpSalary:"+rs.getInt(3));
					}
					con.close();
				}
			}
		}catch(Exception e)
		{
			System.out.println("ERROR"+e);
		}
	}
}
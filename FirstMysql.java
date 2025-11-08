package com.mritunjay;
import java.sql.*;
public class FirstMysql {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//String url="jdbc:mysql://localhost:3306/employee";
			//String user="root";
			//String pass="root";
			//Connection con=DriverManager.getConnection(url,user,pass);
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/employee","root","root");  
			//System.out.println("created");
			if(con.isClosed()) {
				System.out.println("closed");
			}
			else
			{
				System.out.println("created");
			}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
		}

	}

}

package com.mritunjay;
import java.sql.*;

public class InsertJdbc  {

	public static void main(String[] args) throws ClassNotFoundException{
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employee";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			String q="insert into Student(Name,city) values (?,?)";
			PreparedStatement smt= con.prepareStatement(q);
			smt.setString(1,"Vijay");
			smt.setString(2,"bihar");
			smt.executeUpdate();
			System.out.println("inserted");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

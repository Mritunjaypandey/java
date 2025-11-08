package com.mritunjay;
import java.sql.*;
import java.io.*;

public class InsertInputUser {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employee";
			String username="root";
			String password="root";
			Connection con= DriverManager.getConnection(url,username,password);
			String q= "insert into student(name,city) values (?,?)";
			PreparedStatement smt = con.prepareStatement(q); 
			BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Name:");
			String name=rd.readLine();
			System.out.println("enter city:");
			String cit=rd.readLine();
			smt.setString(1,name);
			smt.setString(2, cit);
			smt.executeUpdate();
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

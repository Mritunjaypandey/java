package com.mritunjay;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		String q="update student set name=?,city=? where id=?";
		PreparedStatement prmt=con.prepareStatement(q);
		BufferedReader rd= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr name:");
		String name=rd.readLine();
		System.out.println("Enter City:");
		String city= rd.readLine();
		System.out.println("Enter id:");
		int id=Integer.parseInt(rd.readLine());
		prmt.setString(1, name);
		prmt.setString(2, city);
		prmt.setInt(3, id);
		prmt.executeUpdate();
		con.close();
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package com.mritunjay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employee";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			String q="select * from Student";
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery(q);
			while(rs.next()) {
				int Id=rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				System.out.println("name:"+name+"city"+city+"id"+Id);
				
			}
			con.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

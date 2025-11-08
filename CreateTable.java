package com.mritunjay;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

public class CreateTable {
	public static void main(String [] args) throws ClassNotFoundException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		Statement smt= con.createStatement();
		String q= "create table Student(id int(20) primary key auto_increment,Name varchar(200) Not null,city varchar (200))";
		
		
		smt.executeUpdate(q);
		
		System.out.println("table created");
		con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	
	
}


}

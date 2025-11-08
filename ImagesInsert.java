package com.mritunjay;
import java.sql.*;
import java.io.*;

public class ImagesInsert {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/employee";
			String username="root";
			String password="root";
			Connection con= DriverManager.getConnection(url,username,password);
			String q= "insert into images(pic) values(?)";
			PreparedStatement smt= con.prepareStatement(q);
			FileInputStream fr= new FileInputStream("/D:\\Resume\\New folder\\Mjay_pic.jpg");
			smt.setBinaryStream(1, fr,fr.available());
			smt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

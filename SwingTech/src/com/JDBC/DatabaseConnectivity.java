package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) {
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers Registered ...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root123");
			System.out.println("Connection Established...");
			String sql = "insert into tbl_student values(6,'raju','IT')";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
		}
		catch(Exception e) {
			System.out.print("Exception = "+e);
		}
	}
}

package com.JDBC;

public class DatabaseConnectivity {

	public static void main(String[] args) {
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers Registered ...");
		}
		catch(Exception e) {
			System.out.print("Exception = "+e);
		}
	}
}

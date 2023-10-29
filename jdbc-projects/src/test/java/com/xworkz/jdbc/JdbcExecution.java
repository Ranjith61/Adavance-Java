package com.xworkz.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExecution {
	public static void main(String[] args) {

		String jdbcURL = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "Xworkzodc@123";

		String driverclass = "com.mysql.jdbc.Driver"; // FQCN

		try {
			//Class loading/ class loader
			//load and register driver class
			Class.forName(driverclass);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Getting connection to database");
		try {		
			// set connection to server
			DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Getting connection to database sucessfully !!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

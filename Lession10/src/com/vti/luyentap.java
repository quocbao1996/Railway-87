package com.vti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class luyentap {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/railway87";
		String username = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url);
		if(connection != null) {
			System.out.println("connection ok");
		
		}else {
			System.out.println("connection error");
		}
	}

}

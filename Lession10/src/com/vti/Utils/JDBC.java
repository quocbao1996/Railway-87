package com.vti.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/railway87";
		String username = "root";
		String password = "root";
		Connection connection;
		connection = DriverManager.getConnection(url,username,password);
		if(connection != null) {
			System.out.println("Kết nối thành công " + connection.getCatalog());
		} else {
			System.out.println("Kết nối thất bại " + connection.getCatalog());
		}
		return connection;
	}
	public static void closeConnection(Connection connection, PreparedStatement pstmt, Statement stm, ResultSet rs)
			throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (stm != null) {
			stm.close();
		}
		if (connection != null && !connection.isClosed()) {
			connection.close();

		}
	}
}
		

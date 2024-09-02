package com.vti.frontend;

import java.sql.SQLException;

import com.vti.Utils.JDBC;

public class Program {
	public static void main(String[] args) throws SQLException {
		try {
		JDBC.getConnection();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

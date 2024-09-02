package com.vti.entity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.Utils.JDBC;

public class Program2 {
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		try {
		JDBC.getConnection();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

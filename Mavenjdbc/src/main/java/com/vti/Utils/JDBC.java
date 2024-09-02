package com.vti.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;


public class JDBC {
	public static Connection getConnection() throws SQLException, FileNotFoundException, IOException {
		Properties pr = new Properties();
		pr.load(new FileInputStream(new File("src/main/resource/database.properties")));
		String url = pr.getProperty("url");
		String username = pr.getProperty("username");
		String password = pr.getProperty("password");
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
		

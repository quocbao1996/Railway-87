package com.vti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vti.Utils.JDBC;

public class Program {

	public static void main(String[] args) throws SQLException {
		insertUser("huy", "12345", 2);
		
		String url = "jdbc:mysql://localhost:3306/railway87";
		String username = "root";
		String password = "root";
		try {
		Connection connection = DriverManager.getConnection(url,username,password);
			if(connection != null) {
				System.out.println("Connection ok");
				Statement st = connection.createStatement();
				String sql = "SELECT * FROM users";
				
				ResultSet rs = st.executeQuery(sql);		
				while(rs.next()) {
					int id = rs.getInt("id");
					String us = rs.getString("username");
					System.out.println("User: "+ id+ " "+ us);
				}
				
				
			}else {
				System.out.println("Connection error");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}

	}
	public static void viewUserById(String idTmp) throws SQLException {
		Connection connection = null;
		Statement st = null;
		ResultSet rs = null; 
		try {
			connection = JDBC.getConnection();
			if (connection != null) {
			    st = connection.createStatement();
				String sql = "select * from users where id = " + idTmp;

				 rs = st.executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt("id");
					String us = rs.getString("username");
					System.out.println("User:" + id + "  " + us);
				}

			} else {
				System.out.println("Connection error");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBC.closeConnection(connection,null, st, rs);
		}

	}
	public static void insertUser(String name, String password, int departmentId ) throws SQLException {
		Connection connection = null;
		PreparedStatement pstmt = null;
		try {
			connection = JDBC.getConnection();
			String sql = "insert into users (username,password,department_id) values (?,?,?)";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setInt(3, departmentId);
			int count = pstmt.executeUpdate();
			if(count > 0) {
				System.out.println("Update thành công");
			}
			
		}catch(Exception e) {
			
		}finally {
			JDBC.closeConnection(connection, pstmt, null, null);
		}
	}

}

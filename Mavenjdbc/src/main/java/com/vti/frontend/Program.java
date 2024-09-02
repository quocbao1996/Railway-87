package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.Utils.JDBC;

public class Program {

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		System.out.println("============1============");
		Connection connection = JDBC.getConnection();
		String sql = "(Call GetListAllUser())";
		CallableStatement call = connection.prepareCall(sql);
		ResultSet rs = call.executeQuery();
		while (rs.next()) {
			System.out.println("username+ "+ rs.getString("username"));
		}
		JDBC.closeConnection(null, call, null, rs);
		System.out.println("============2============");
		String sql2 = "(Call GetListUserById(?))";
		CallableStatement call2 = connection.prepareCall(sql2);
		call2.setInt(1,2);
		ResultSet rs2 = call2.executeQuery();
		while (rs.next()) {
			System.out.println("username+ "+ rs2.getString("username"));
		}
		JDBC.closeConnection(null, call, null, rs);
		
		System.out.println("============3============");
		String sql3 = "(Call updateUserById(?,?))";
		CallableStatement call3 = connection.prepareCall(sql3);
		call3.setInt(1,2);
		call3.setString(2, "bao123");
		int count = call3.executeUpdate();
		if(count >0) {
			System.out.println("Update ok");
		}
		JDBC.closeConnection(connection, call3, null, null);
	}

}

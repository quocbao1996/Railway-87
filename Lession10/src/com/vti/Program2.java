package com.vti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program2 {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/final_exam_05";
		String username = "root";
		String password = "root";
		try {
		Connection connection = DriverManager.getConnection(url,username,password);
			if(connection != null) {
				System.out.println("Kết nối thành công " + connection.getCatalog());
				Statement st = connection.createStatement();
				String sql = "SELECT * FROM users";
				
				
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					int id = rs.getInt("id");
					String us= rs.getString("full_name");
					System.out.println("User: "+ id+ " "+ us);
					
				String sql1 = "INSERT INTO 'users' ('full_name','email')"+
							"VALUES  ('Nhật Khang','khang@gmail')";
				int  update =  st.executeUpdate(sql1);
					
				}
						
			}else {
				System.out.println("Kết nối thất bại");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
	}
}

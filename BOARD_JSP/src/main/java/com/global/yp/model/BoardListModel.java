package com.global.yp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardListModel {

	public ResultSet list() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn =  DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/board"
				, "root"
				, "1234");
		
		String sql = "select * from board order by seq desc";
		PreparedStatement ps = conn.prepareStatement(sql);
		return ps.executeQuery();
	}

}

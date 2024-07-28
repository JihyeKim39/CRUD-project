package com.global.yp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServletRequest;

public class BoardReadModel {
	
	public ResultSet read (HttpServletRequest req) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/board", "root", "1234");

		String sql = "select * from board where seq = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, req.getParameter("seq"));
		return ps.executeQuery();

	}

}

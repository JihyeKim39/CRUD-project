package com.global.yp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jakarta.servlet.http.HttpServletRequest;

public class BoardDeleteModel {

	public void delete(HttpServletRequest req) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn =  DriverManager.getConnection(
				"jdbc:mariadb://localhost:3306/board"
				, "root"
				, "1234");
		
		String sql = "delete from board where seq = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, req.getParameter("seq"));
		int count = ps.executeUpdate();
		
	}

}

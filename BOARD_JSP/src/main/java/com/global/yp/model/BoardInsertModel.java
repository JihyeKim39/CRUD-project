package com.global.yp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServletRequest;

public class BoardInsertModel {
	public void insert(HttpServletRequest req) throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/board", "root", "1234");
		System.out.println(conn);

		String sql = "insert into board(title,content) values (?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, req.getParameter("title"));
		ps.setString(2, req.getParameter("content"));
		int count = ps.executeUpdate();
		System.out.println(count);
	}
}

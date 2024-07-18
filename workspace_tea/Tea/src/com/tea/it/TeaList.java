package com.tea.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TeaList {

	public void list() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/tea", "root", "1234");
		
//		Scanner scan= new Scanner(System.in);
//		String teaname = scan.next();
//		System.out.println("Input teaname: ");
//		String teaorigin = scan.next();
//		System.out.println("Input teaorigin: ");
//		int teaprice = scan.nextInt();
//		System.out.println("Input teaprice: ");
		
		String sql = "select * from tea";
		PreparedStatement ps = conn.prepareStatement(sql);
//		ps.setString(1, teaname);
//		ps.setString(2, teaorigin);
//		ps.setInt(3, teaprice);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString("seq") + "|");
			System.out.print(rs.getString("teaname") + "|");
			System.out.print(rs.getString("teaorigin") + "|");
			System.out.print(rs.getString("teaprice") + "|");
			System.out.print(rs.getString("createdate") + "|");
			System.out.println();
		}
	}

	public void read(String seq) throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/tea", "root", "1234");

//			Scanner scan= new Scanner(System.in);
//			String teaname = scan.next();
//			System.out.println("Input teaname: ");
//			String teaorigin = scan.next();
//			System.out.println("Input teaorigin: ");
//			int teaprice = scan.nextInt();
//			System.out.println("Input teaprice: ");

		String sql = "select * from tea where seq = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, seq);
//			ps.setString(1, teaname);
//			ps.setString(2, teaorigin);
//			ps.setInt(3, teaprice);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getString("seq") + "|");
			System.out.print(rs.getString("teaname") + "|");
			System.out.print(rs.getString("teaorigin") + "|");
			System.out.print(rs.getString("teaprice") + "|");
			System.out.print(rs.getString("createdate") + "|");
			System.out.println();
		}

	}
}

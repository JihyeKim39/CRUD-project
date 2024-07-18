package com.tea.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TeaWrite {

	public void write() throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/tea","root","1234");
		System.out.println(conn);

		Scanner scan = new Scanner(System.in);
		System.out.println("Input teaname: ");
		String teaname = scan.next();
		System.out.println("Input teaorigin: ");
		String teaorigin = scan.next();
		System.out.println("Input teaprice: ");
		int teaprice = scan.nextInt();

		String sql = "insert into tea(teaname,teaorigin,teaprice) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, teaname);
		ps.setString(2, teaorigin);
		ps.setInt(3, teaprice);
		int count = ps.executeUpdate();

	}

}
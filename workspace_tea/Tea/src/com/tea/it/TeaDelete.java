package com.tea.it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TeaDelete {

	public void delete(String seq) throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/tea","root","1234");
		System.out.println(conn);
//		Scanner scan = new Scanner(System.in);
//		String teaname = scan.next();

//		System.out.println("Input teaname: ");
//		String teaorigin = scan.next();
//		System.out.println("Input teaorigin: ");
//		int teaprice = scan.nextInt();
//		System.out.println("Input teaprice: ");

		String sql = "delete from tea where seq = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
//		ps.setString(1, teaname);
//		ps.setString(2, teaorigin);
//		ps.setInt(3, teaprice);
		ps.setString(1, seq);
		int count = ps.executeUpdate();
	}

}

package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTest {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/tea");
		System.out.println(conn);
//		Scanner scan = new Scanner(System.in);
//		String teaname = scan.next();
//		System.out.println("Input teaname: ");
//		String teaorigin = scan.next();
//		System.out.println("Input teaorigin: ");
//		int teaprice = scan.nextInt();
		
		String sql = "select * from tea";
		PreparedStatement ps = conn.prepareStatement(sql);
//		ps.setString(1, teaname);
//		ps.setString(2, teaorigin);
//		ps.setInt(3, teaprice);
		ResultSet rs = ps.executeQuery();
		System.out.println(rs);
		while (rs.next()) {
			System.out.println(rs.getString("seq") + "|");
			System.out.println(rs.getString("teaname") + "|");
			System.out.println(rs.getString("teaorigin") + "|");
			System.out.println(rs.getInt("teaprice") + "|");
			System.out.println(rs.getString("createdate") + "|");
		}
		
	}

}

package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3307/tea");
		System.out.println(conn);

		Scanner scan = new Scanner(System.in);
		System.out.println("Input seq: ");
		String teaname = scan.next();

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
		ps.setString(1, sql);
		int count = ps.executeUpdate();
		System.out.println(count);

	}

}
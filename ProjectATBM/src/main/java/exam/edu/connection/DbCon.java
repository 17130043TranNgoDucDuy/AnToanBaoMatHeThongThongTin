package exam.edu.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
	public DbCon() {
		super();
	}
	private static Connection connection = null;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/at", "root", "");
			System.out.println("KN thành công!");
		} catch (RuntimeException | ClassNotFoundException | SQLException e) {
			System.out.println("KN thất bại!" + e.getMessage());
		}
		return connection;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnection());
	}
}

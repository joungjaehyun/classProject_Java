package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() throws SQLException {
		
		// DB URL 
		String dbURL = "jdbc:mysql://localhost:3306/project";
		
		return DriverManager.getConnection(dbURL, "himedia", "tiger");
	}
}

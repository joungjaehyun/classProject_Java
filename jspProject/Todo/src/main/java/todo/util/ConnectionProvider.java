package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	// Service : Dao 메소드에 매개변수로 전달
	public static Connection getConnection() throws SQLException {
		
		// DB URL 
		String dbURL = "jdbc:mysql://localhost:3306/project";
		
		return DriverManager.getConnection(dbURL, "himedia", "tiger");
	} 
	
	
}

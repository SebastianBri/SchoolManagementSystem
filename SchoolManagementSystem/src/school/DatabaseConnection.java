package school;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DatabaseConnection {
	
	private static String serverName ="localhost"; // The name of the server
	private static String username = "root"; // The username
	private static String dbname = "school"; // The name of the database
	private static Integer portnumber = 3306; // The port for the server
	private static String password = ""; // The password
	
	public static Connection getConnection() {
		Connection conn = null; // the connection variable
		
		MysqlDataSource datasource = new MysqlDataSource();
		
		/* 
		 * Sets all the config up
		 */
		datasource.setServerName(serverName);
		datasource.setUser(username);
		datasource.setPassword(password);
		datasource.setDatabaseName(dbname);
		datasource.setPortNumber(portnumber);
		
		try {
			conn = datasource.getConnection(); // Connect to the database
		} catch (SQLException e) {
			e.printStackTrace(); // Give error message.
		}
		
		return conn; // return the connection
	}
}

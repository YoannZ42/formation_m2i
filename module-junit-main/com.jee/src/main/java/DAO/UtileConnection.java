package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtileConnection {

	public static Connection seConnecter() {
		
		String DRIVER = "com.mysql.cj.jdbc.Driver"; // org.postgresql.Driver
		String URL= "jdbc:mysql://localhost:3306/hello"; // jdbc:postgresql://localhost:5432/<You Db Name>
		String LOGIN= "root"; // postgres
		String PASSWORD= "root"; // postgres
		
		Connection connection = null;
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
		} catch (SQLException e) {
			System.out.println("SQLException");
		} catch (ClassNotFoundException e1) {
			System.out.println("ClassNotFoundException");
		}
		
				
		return connection;
	}	
}

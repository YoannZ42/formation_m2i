package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Follower;

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
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("Open connection");
		Connection con = UtileConnection.seConnecter();
		
//		Statement st = con.createStatement();		
//		String query = "CREATE TABLE IF NOT EXISTS followers (id SERIAL PRIMARY KEY, name VARCHAR(255), age INT); ";
//		String query = "UPDATE followers SET name='tata', age=8 WHERE id=1;";
//		String query = "DELETE FROM followers WHERE id=2;";		
//		st.execute(query);		
		

		String query = "SELECT * FROM followers";
		ResultSet rs = con.createStatement().executeQuery(query);
		
		while( rs.next() ) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
						
			System.out.println("Follower " +id+":" + name +","+ age);
		}
		
		rs.close();
		con.close();
		System.out.println("connection close");
	}
}

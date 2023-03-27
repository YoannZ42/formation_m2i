package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.UtileConnection;
import entity.Follower;

public class FollowersService {
	
	
	public List<Follower> getAll(){
		
		List<Follower> ret = new ArrayList<Follower>();
		
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "SELECT * FROM followers";
			ResultSet rs = con.createStatement().executeQuery(query);
			
			while ( rs.next() ) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				ret.add( new Follower(id, age, name) );
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return ret;
	}
	
	public Follower getById(int id) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "SELECT * FROM followers WHERE id="+ id +";";
			
			ResultSet rs = con.createStatement().executeQuery(query);
			
			if (rs.next() ) {
				String name = rs.getString("name");
				int age = rs.getInt("age");			
				
				return new Follower(id, age, name);
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void add(Follower f) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "INSERT INTO followers (name, age) VALUES ('"+ f.getName() +"',"+ f.getAge() +");";
			
			con.createStatement().execute(query);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Follower f) {
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "UPDATE followers SET name='"+ f.getName() +"', age="+ f.getAge() +" WHERE id="+ f.getId() +";";
			con.createStatement().execute(query);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		
		try {
			Connection con = UtileConnection.seConnecter();
			
			String query = "DELETE FROM followers WHERE id="+ id +";";
			con.createStatement().execute(query);
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
}

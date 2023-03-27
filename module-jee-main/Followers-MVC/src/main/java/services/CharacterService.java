package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.UtilConnection;
import entity.Characters;

public class CharacterService {
	
	public Characters getOne(int id) {
		try {
			Connection con = UtilConnection.seConnecter();
			String query = "SELECT * FROM characters WHERE id=" + id +";";
			ResultSet rs = con.createStatement().executeQuery(query);
			
			if (rs.next()) {
				String name = rs.getString("name");
				String type = rs.getString("type");
				int level = rs.getInt("level");
				int size = rs.getInt("size");
				
				return new Characters(id, name, level, size, type);
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Characters> getAll(){
		
		List<Characters> ret = new ArrayList<Characters>();
		
		try {
			Connection con = UtilConnection.seConnecter();
			String query = "SELECT * FROM characters;";
			ResultSet rs = con.createStatement().executeQuery(query);
			
			while (rs.next()) {
				String name = rs.getString("name");
				String type = rs.getString("type");
				int id = rs.getInt("id");
				int level = rs.getInt("level");
				int size = rs.getInt("size");
				
				ret.add( new Characters(id, name, level, size, type));
			}


			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public void create(Characters c) {
		try {
			Connection con = UtilConnection.seConnecter();
			String query = "INSERT INTO characters (name, level, size, type) VALUES ('"+c.getName()+"'," +c.getLevel()+", "+c.getSize()+",'"+c.getType()+"');";

			con.createStatement().execute(query);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(Characters c) {
		try {
			Connection con = UtilConnection.seConnecter();
			String query = "UPDATE characters SET name='"+c.getName()+"', level="+c.getLevel()+", size="+c.getSize()+", type='"+c.getType()+"' WHERE id="+ c.getId() +";";

			con.createStatement().execute(query);
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try {
			Connection con = UtilConnection.seConnecter();
			String query = "DELETE FROM characters WHERE id="+ id +";";
			con.createStatement().execute(query);
						
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

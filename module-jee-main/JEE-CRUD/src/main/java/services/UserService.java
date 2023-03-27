package services;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import dao.Database;
import entity.User;

public class UserService {

	private ArrayList<User> usersDB = Database.user;
	
	public User getUserById(int id) {
		
		for (User u : usersDB) {
			if (u.getId() == id) {
				return u;
			}
		}
		
		return null;
	}
	
	public ArrayList<User> getAll(){
		return usersDB;
	}
	
	public boolean createUser(User u) {
		boolean found = false;
		
		for (User user: usersDB) {
			if ( user.getId() == u.getId()) {
				found = true;
			}
		}
		
		if ( found == false) {
			usersDB.add(u);		
			return true;
		} else {
			return false;
		}
	}
	
	public void updateUser(User u) {
		
		for ( User user : usersDB) {
			if ( user.getId() == u.getId()) {
				user.setAge( u.getAge() );
				user.setEmail( u.getEmail() );
				user.setName( u.getName() );
				user.setNbArticles( u.getNbArticles());
				user.setPassword( u.getPassword()); 
			}
		}
		
	}
	
	public boolean deleteUser(int id) {
		
		User found = null;
		
		for( User u : usersDB) {
			if (u.getId() == id ) {
				found = u;
			}
		}
		
		if (found == null) {
			return false;
		} else {
			usersDB.remove(found);
			return true;
		}
		
	}
	
	
	public User createUserFromRequest(HttpServletRequest request) {
		try {
			int id = Integer.parseInt( request.getParameter("id") );
			int nbArticles = Integer.parseInt( request.getParameter("nbarticles") );
			int age = Integer.parseInt( request.getParameter("age") );
			
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			
			return new User(id, age, name, email, password, nbArticles);
			
		} catch (NumberFormatException e) {
			System.out.println("Error in createUserFromRequest");
			return null;
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}

package dao;

import java.util.ArrayList;

import entity.Product;
import entity.User;

public class Database {

	public static ArrayList<Product> stock = new ArrayList<Product>() {
		{
			add(new Product(3,"Ecran", "24'' ", 124 , "Samsung"));
			add(new Product(2,"Souris", "Souris filaire", 6 , "Razer"));
			add(new Product(4,"Cendrier", "Cendrier OCB", 4 , "OCB"));
			add(new Product(1,"Clavier", "Super clavier sans fil", 18 , "Dell"));
		}
	};
	
	
	public static ArrayList<User> user = new ArrayList<User>() {
		{
			add( new User(1, 26, "Java", "example@laposte.net", "azerty", 2) );
			add( new User(2, 28, "Jee", "example@laposte.net", "azerty", 2) );
			add( new User(3, 32, "Jakarta", "example@laposte.net", "azerty", 2) );
			add( new User(4, 21, "JUnit", "example@laposte.net", "azerty", 2) );
			add( new User(5, 41, "Mysql", "example@laposte.net", "azerty", 2) );
		}
	};
	
	
}

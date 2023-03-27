package manyToOne;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity @Table( name="users")
public class User {
	
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String email;
	
	private int age;
	
	
	@OneToMany
	@JoinTable( name = "message_user_association",
				joinColumns =  @JoinColumn(name ="id_user"),
				inverseJoinColumns = @JoinColumn(name = "id_message"))
	List<Message> messages;
	
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
		
	@OneToMany( targetEntity = Commande.class, mappedBy = "user" )
	List<Commande> commandes;
	
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	public List<Commande> getCommandes() {
		return commandes;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age="
				+ age + "]";
	}
	

	public User(String firstName, String lastName, String email, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public User(int id, String firstName, String lastName, String email, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	
	
}


/**
CREATE TABLE users (
id SERIAL PRIMARY KEY,
first_name VARCHAR(32),
last_name VARCHAR(32),
email VARCHAR(64),
age INT
); 
*/
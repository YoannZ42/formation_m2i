package SINGLE_TABLE;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table ( name ="d_vehicule")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name= "discriminator", discriminatorType = DiscriminatorType.INTEGER)
public abstract class DVehicule {
	
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int id;
	
	private int vitesse;
	
	private String name;
	
	private int places;

	public DVehicule() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "DVehicule [id=" + id + ", vitesse=" + vitesse + ", name=" + name + ", places=" + places + "]";
	}
	
	
}

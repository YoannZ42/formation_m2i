package JOINED;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name="j_voiture")
@PrimaryKeyJoinColumn(name="id_vehicule")
public class JVoiture extends JVehicule{

	private int chevaux;
	
	private String marque;

	public int getChevaux() {
		return chevaux;
	}

	public void setChevaux(int chevaux) {
		this.chevaux = chevaux;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public String toString() {
		return super.toString() + "JVoiture [chevaux=" + chevaux + ", marque=" + marque + "]";
	}

	public JVoiture() {
		super();
	}
	
}

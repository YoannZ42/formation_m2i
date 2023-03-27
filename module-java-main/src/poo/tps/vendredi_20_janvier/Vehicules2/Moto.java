package poo.tps.vendredi_20_janvier.Vehicules2;

public class Moto extends Vehicule {
    public Moto(String marque, int anneeModel) {
        super(marque, anneeModel);
    }

    public void demarrer(){
        System.out.println("Moto drrrr");
    }

    public void accelerer(){
        System.out.println("Moto vrrrr");
    }
}

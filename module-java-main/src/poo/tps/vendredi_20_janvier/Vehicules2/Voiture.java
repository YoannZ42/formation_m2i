package poo.tps.vendredi_20_janvier.Vehicules2;

public class Voiture extends Vehicule{

    public Voiture(String marque, int anneeModel) {
        super(marque, anneeModel);
    }

    @Override
    public void accelerer() {
        System.out.println("vrrrrrrr");
    }

    @Override
    public void demarrer() {
        System.out.println("vraaaaa");
    }
}


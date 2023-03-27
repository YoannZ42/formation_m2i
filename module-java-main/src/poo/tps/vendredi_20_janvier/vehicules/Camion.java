package poo.tps.vendredi_20_janvier.vehicules;

class Camion extends Vehicule {


    public Camion(String marque, int anneeModele, int prix) {
        super(marque, anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion démarre");
    }

    @Override
    public void accelerer() {
        System.out.println("Le camion accélère");
    }
}
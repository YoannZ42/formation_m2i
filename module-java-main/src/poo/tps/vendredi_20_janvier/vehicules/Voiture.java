package poo.tps.vendredi_20_janvier.vehicules;

class Voiture extends Vehicule {


    public Voiture(String marque, int anneeModele, int prix) {
        super(marque, anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }

    @Override
    public void accelerer() {
        System.out.println("La voiture accélère");
    }
}

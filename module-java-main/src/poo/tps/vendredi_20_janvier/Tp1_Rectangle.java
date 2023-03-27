package poo.tps.vendredi_20_janvier;

public class Tp1_Rectangle {
    private double longueur;
    private double largeur;


    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double calculAire(){
        return longueur*largeur;
    }

    public double calculPerimetre(){
        return 2*(longueur+largeur);
    }
}

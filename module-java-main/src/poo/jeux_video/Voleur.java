package poo.jeux_video;

public class Voleur extends Personnage{
    private String outilPourVoler;

    public Voleur(String nom, int dureeDeVie, String outilPourVoler) {
        super(nom, dureeDeVie);
        this.outilPourVoler = outilPourVoler;
    }

    public String getOutilPourVoler() {
        return outilPourVoler;
    }

    public void setOutilPourVoler(String outilPourVoler) {
        this.outilPourVoler = outilPourVoler;
    }


    @Override
    public void rencontrer() {
        System.out.println("Je vais fuir.");
    }
}

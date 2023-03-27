package poo.jeux_video;

import java.util.InputMismatchException;

public class Magicien extends Personnage {
    private String baguetteMagique;

    public Magicien(String nom, int dureeDeVie, String baguetteMagique) {
        super(nom, dureeDeVie);
        this.baguetteMagique = baguetteMagique;
    }

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) throws InputMismatchException {
        if(baguetteMagique.isEmpty()){
            throw new InputMismatchException("La baguette magique ne doit pas être vide");
        }
        this.baguetteMagique = baguetteMagique;
    }

    public void rencontrer(){
        System.out.println("Je suis un magicien");
    }
}

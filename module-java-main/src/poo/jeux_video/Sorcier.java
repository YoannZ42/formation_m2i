package poo.jeux_video;

import java.util.InputMismatchException;

public class Sorcier extends Magicien {
    private String batonMagique;

    public Sorcier(String nom, int dureeDeVie, String baguetteMagique, String batonMagique) {
        super(nom, dureeDeVie, baguetteMagique);
        this.batonMagique=batonMagique;
    }


    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) throws InputMismatchException {
        if(batonMagique.isEmpty()){
            throw new InputMismatchException("La baton magique ne doit pas être vide");
        }
        this.batonMagique = batonMagique;
    }

    public void rencontrer(){
        System.out.println("Je suis un sorcier");
    }
}

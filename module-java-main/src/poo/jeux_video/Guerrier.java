package poo.jeux_video;

import java.util.InputMismatchException;

public class Guerrier extends Personnage {

    private String arme;


    public Guerrier(String nom, String arme, int dureeDeVie) {
        super(nom,dureeDeVie);
        this.arme = arme;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) throws InputMismatchException {
        if(arme.isEmpty()){
            throw new InputMismatchException("L'arme ne doit pas être vide");
        }
        this.arme = arme;
    }

    public void rencontrer(){
        System.out.println("Je suis un guerrier");
    }

    public String toString(){
        return super.toString()+String.format("\nArme : %s",this.arme);
    }
}

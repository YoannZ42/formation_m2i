package poo.jeux_video;

import java.util.InputMismatchException;

public abstract class Personnage {
    private String nom;
    private int dureeDeVie;

    public String getNom() {
        return nom;
    }

    public Personnage(String nom,int dureeDeVie){
        this.nom=nom;
        this.dureeDeVie=dureeDeVie;
    }

    public void setNom(String nom) throws InputMismatchException {
        if(nom.isEmpty() || nom.contains("\\d")){
            throw new InputMismatchException("Le nom ne peut pas être vide ou contain " +
                    "des chiffres");
        }
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) throws InputMismatchException {
        if(dureeDeVie<0 || dureeDeVie>100){
            throw new InputMismatchException("La durée de vie doit être >=0 et <=100");
        }
        this.dureeDeVie = dureeDeVie;
    }

    public abstract void rencontrer();

    public String toString(){
        return String.format("Nom : %s\nDurée : %d",this.nom,this.dureeDeVie);
    }
}

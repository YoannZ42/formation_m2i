package poo.tps.vendredi_20_janvier.vehicules;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

abstract class Vehicule {
    private static int nextMatricule = 1;
//    private static int nombreVehicules=0;
    public static ArrayList<Vehicule> vehicules=new ArrayList<>();

    private String marque;
    private int matricule;
    private int anneeModele;
    private int prix;

    private String type;

    // Constructeur
    public Vehicule(String marque,int anneeModele ,int prix) {
        this.matricule = nextMatricule++;
        this.marque = marque;
        this.anneeModele=anneeModele;
        this.prix = prix;
        vehicules.add(this);
    }

    // Accesseurs
    public int getMatricule() {
        return matricule;
    }

    public int getAnneeModele() {
        return anneeModele;
    }

    public int getPrix() {
        return prix;
    }

    // Mutateurs
    public void setAnneeModele(int anneeModele) {
        this.anneeModele = anneeModele;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }


    public abstract void demarrer();
    public abstract void accelerer();

    // Méthode toString
    public String toString() {
        return String.format("Maque : %s\nMatricule :  %s\nAnnée modèle : %d\nPrix : %d",this.marque,this.matricule,this.anneeModele,this.prix);
    }

    public static int vehiculesCrees(){
        return nextMatricule;
    }


    private static HashMap<String,Integer> associerTypeOccurence(){
        HashMap<String,Integer> pourcentageParMarque=new HashMap<>();

        for(var vs:vehicules){
            String[] classNameArr =vs.getClass().toString().split("\\.");
            String typeDeVehicule=classNameArr[classNameArr.length-1];
            if(pourcentageParMarque.containsKey(typeDeVehicule)){
                int occurrences=pourcentageParMarque.get(typeDeVehicule);
                pourcentageParMarque.replace(typeDeVehicule,occurrences+1);
            }else {
                pourcentageParMarque.put(typeDeVehicule,1);
            }
        }
        return pourcentageParMarque;
    }

    public static HashMap<String,Double> calculerPourcentageParMarque(){
        var associationTypeOccurence=associerTypeOccurence();
        var pourcentageParMarque=new HashMap<String, Double>();

        for (Map.Entry<String, Integer> entry : associationTypeOccurence.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            pourcentageParMarque.put(key, (double) ((value*100)/vehicules.size()));

        }
        return  pourcentageParMarque;
    }
}
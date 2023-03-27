package poo.tps.vendredi_20_janvier.Vehicules2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Vehicule {
    private String marque;
    private int anneeModel;
    private int matricule;
    private static int matriculeCourant=0;
    private static ArrayList<Vehicule> vehicules=new ArrayList<>();
    public Vehicule(String marque,int anneeModel){
        this.marque=marque;
        this.anneeModel=anneeModel;
        this.matricule=++matriculeCourant;
        vehicules.add(this);
    }
    public abstract void accelerer();
    public abstract void demarrer();



    public static void rouler(){
        for(var vehicule:vehicules){
            vehicule.demarrer();
            vehicule.accelerer();
        }
    }

    public static int nombreVehicules(){
        return vehicules.size();
    }

    public static String extractClassName(Vehicule v){
        var tb=v.getClass().toString().split("\\.");
        return tb[tb.length-1];
    }

    public static HashMap<String,Integer> associerTypeOccurence(){
        HashMap<String,Integer> occurences=new HashMap<>();
        for(var vehicule:vehicules){
            var cle=extractClassName(vehicule);
            if(occurences.containsKey(cle)){
                int valeurCourant=occurences.get(cle);
                occurences.replace(cle,valeurCourant+1);
            }else{
                occurences.put(cle,1);
            }
        }
        return occurences;
    }

    public static HashMap<String, Double> tauxParType(){
        HashMap<String,Double> tauxParType = new HashMap<>();

        HashMap<String,Integer> assocationOccurence=associerTypeOccurence();

        for(Map.Entry<String,Integer> map:assocationOccurence.entrySet()){
            var key=map.getKey();
            var value=map.getValue();
            tauxParType.put(key,(double)value*100/vehicules.size());
        }

        return tauxParType;
    }
}

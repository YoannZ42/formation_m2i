package poo;

import java.util.InputMismatchException;

public class Avion {
    private String marque;
    private String modele;
    private int nombreSieges;

    public Avion(String marque,String modele,int nombreSieges){
//        Approche sans setters
//       if(marque.length()!=0){
//           this.marque=marque;
//       }
//
//       if(modele.length()!=0){
//           this.modele=modele;
//       }
//
//
//        if(nombreSieges>0){
//            this.nombreSieges=nombreSieges;
//        }
//

//        Utilisation des setters
        this.setMarque(marque);
        this.setModele(modele);
        this.setNombreSieges(nombreSieges);
    }

    // Accesseurs
    public String getMarque(){
        return marque;
    }

    public String getModele(){
        return modele;
    }

    public int getNombreSieges(){
        return nombreSieges;
    }
    // Manipulateurs
    public void setMarque(String marque)throws InputMismatchException{
//        Méthode 1 : Sans gestion des exceptions
//        if(marque.length()!=0){
//            this.marque=marque;
//        }
//
//        Méthode 2 : Avec la gestion des exceptions
        if(marque.length()==0){
            throw new InputMismatchException("La marque ne doit pas être vide.");
        }
        this.marque=marque;
    }

    public void setModele(String modele)throws InputMismatchException{
        //        Méthode 1 : Sans gestion des exceptions
//        if(modele.length()!=0){
//            this.modele=modele;
//        }
        //        Méthode 2 : Avec la gestion des exceptions
        if(modele.length()==0){
            throw new InputMismatchException("Le modèle ne doit pas être vide.");
        }
        this.modele=modele;
    }

    public void setNombreSieges(int nombreSieges) throws InputMismatchException{
//        Méthode 1 : Sans gestion des exceptions
//        if(nombreSieges>0){
//            this.nombreSieges=nombreSieges;
//        }

//        Méthode 2 : Gestion des exceptions
        if(nombreSieges<=0){
            throw new InputMismatchException("Erreur:Le nombre de sièges doit toujouts " +
                    "être positif");
//            System.out.println("Erreur:Le nombre de sièges doit toujours être positif");
        }
        this.nombreSieges=nombreSieges;
    }
}

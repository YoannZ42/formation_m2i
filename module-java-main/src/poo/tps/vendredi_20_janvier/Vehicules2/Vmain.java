package poo.tps.vendredi_20_janvier.Vehicules2;


import java.util.Arrays;

public class Vmain {
    public static void main(String[] args) {


//        Création d'un voiture
        var maVoiture=new Voiture("Toyota",2003);
        var saVoiture=new Voiture("Mercedes",2000);


//        Création des camions
        var cam1=new Camion("Mercedes",1999);
        var cam2=new Camion("Mercedes",1988);


// Création des motos
        var moto1=new Moto("Honda",2004);
        var moto2=new Moto("Suzuki",2000);
        var moto3=new Moto("Honda",2007);

//        Vehicule.rouler();

//        System.out.printf("Il y a %d véhicules.",Vehicule.nombreVehicules());

        System.out.println(Vehicule.tauxParType());
    }
}

//class poo.tps.vendredi_20_janvier.Vehicules2.Voiture
//["class poo","tps","vendredi_20_janvier,"Vehicules2","Voiture"]
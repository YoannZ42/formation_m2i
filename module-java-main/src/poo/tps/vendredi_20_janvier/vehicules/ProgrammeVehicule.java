package poo.tps.vendredi_20_janvier.vehicules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ProgrammeVehicule {
        public static void main(String[] args) {
            Voiture v = new Voiture("Toyota", 10000,6000);
            Camion c = new Camion("Mercedes", 20000,15000);
            Camion c2 = new Camion("Mercedes", 20100,12000);


            System.out.println(v);
            v.demarrer();
            v.accelerer();

            System.out.println(c);
            c.demarrer();
            c.accelerer();

            System.out.println(Vehicule.vehicules.size());





            System.out.println(Vehicule.calculerPourcentageParMarque());
        }
    }

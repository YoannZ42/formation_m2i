package fondamentaux.correction_tps;

import java.util.HashMap;
import java.util.Scanner;

public class Point14_HashMap {
    public static void main(String[] args) {
        int[] nombres={1,2,1,3,3,4,5,6,7,8,3,9,10,4,3};

        HashMap<Integer,Integer> occurences=new HashMap<>();

        System.out.println(occurences);

//        // Faire une boucle sur le tableau nombres
//        for(int i=0;i<nombres.length;i++){
//            // Si l'element existe déjà, on augmente sa valeur de 1
//            if(occurences.containsKey(nombres[i])){
//                int nombreOccurences=occurences.get(nombres[i]);//1
//                occurences.replace(nombres[i],nombreOccurences+1);
//            }else {
//                // Si l'element n'existe pas, on l'joute avec comme nombre d'occurences 1
//                occurences.put(nombres[i],1);
//            }
//        }

        for (int nombre:nombres){
            if(occurences.containsKey(nombre)){
                int nombreOccurences=occurences.get(nombre);//1
                occurences.replace(nombre,nombreOccurences+1);
            }else {
                occurences.put(nombre,1);
            }
        }

        System.out.println(occurences);
        var input=new Scanner(System.in);
        System.out.print("Veuillez entre un nombre a rechercher : ");
        var nombreARechercher=input.nextInt();

        System.out.printf("%d existe et se retrouve %d fois dans la liste.\n",
                nombreARechercher,occurences.get(nombreARechercher));

    }
}


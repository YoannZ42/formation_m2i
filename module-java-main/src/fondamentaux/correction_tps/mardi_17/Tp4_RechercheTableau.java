package fondamentaux.correction_tps.mardi_17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tp4_RechercheTableau {

    public static void main(String[] args) {
        int taille=30;
        int[] nombres=new int[taille];
        var random=new Random();
        for(var i=1;i<taille;i++){
            nombres[i]=random.nextInt(50);
        }

        System.out.print("Entrer le nombre à rechercher : ");
        var nombreARechercher=new Scanner(System.in).nextInt();
        var occurrence=0;
        for(int nombre:nombres){
            if(nombre==nombreARechercher){
                occurrence++;
            }
        }

        if(occurrence>0){
            System.out.printf("%d se retrouve %d fois dans le tableau.\n\n",
                    nombreARechercher,occurrence);
        }else {
            System.out.println("Le nombre n'existe pas dans le tableau.\n");
        }

//        Juste pour verifier
        System.out.println(Arrays.toString(nombres));
    }
}

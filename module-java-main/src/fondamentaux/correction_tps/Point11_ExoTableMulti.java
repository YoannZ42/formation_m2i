package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point11_ExoTableMulti {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Entrer le nombre dont vous voulez connaître la table : ");
        var nombre=input.nextInt();

        System.out.print("Début : ");
        var debut=input.nextInt();

        System.out.print("Fin : ");
        var fin=input.nextInt();

        System.out.println("*************************");
        System.out.printf("****   Table de %d   *****\n",nombre);
        System.out.println("*************************\n");
        for (int i=debut;i<=fin;i++){
            var produit=nombre*i;
            System.out.printf("%d x %d = %d\n",nombre,i,produit);
        }
    }
}

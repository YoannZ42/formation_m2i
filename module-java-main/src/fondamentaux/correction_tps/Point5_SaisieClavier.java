package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point5_SaisieClavier {
    public static void main(String[] args) {
        Scanner keyboardInput=new Scanner(System.in);
        System.out.print("Votre nom: ");

        // On lit tous les caractère jusqu'au premier
        // espace où l'on s'arrête.
//        String nom=keyboardInput.next();
        String nom=keyboardInput.nextLine();// Lire toute la ligne
        System.out.println(nom);

        System.out.print("Votre age : ");
        int age=keyboardInput.nextInt();
        System.out.println(age);

        System.out.print("Votre poids : ");
        double poids=keyboardInput.nextDouble();

        System.out.println(poids);
    }
}


//Christian
// 45 papa45
//45
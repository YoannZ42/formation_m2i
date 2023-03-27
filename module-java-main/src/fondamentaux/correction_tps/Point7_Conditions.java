package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point7_Conditions {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Votre age : ");
        var age = input.nextInt();
        /**
         * Si age > = 18 alors
         * afficher "Vous êtes majeur"
         * Sinon
         * afficher vous êtes mineur
         *
         * */
        var estMajeur = age >= 18;

        // if(age>=18)
        if (estMajeur) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
    }

}

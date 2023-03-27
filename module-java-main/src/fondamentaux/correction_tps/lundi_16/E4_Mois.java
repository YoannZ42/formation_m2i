package fondamentaux.correction_tps.lundi_16;

import java.util.Scanner;

public class E4_Mois {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("Entrer un nombre de mois : ");
        int mois=clavier.nextByte();
        switch (mois) {
            case 1 -> System.out.println("Janvier");
            case 2 -> System.out.println("Février");
            case 3 -> System.out.println("Mars");
            case 4 -> System.out.println("Avril");
            case 5 -> System.out.println("Mai");
            case 6 -> System.out.println("Juin");
            case 7 -> System.out.println("Juillet");
            case 8 -> System.out.println("Août");
            case 9 -> System.out.println("Septembre");
            case 10 -> System.out.println("Octobre");
            case 11 -> System.out.println("Novembre");
            case 12 -> System.out.println("Decembre");
            default -> System.out.println("Mois invalide");
        }
    }
}

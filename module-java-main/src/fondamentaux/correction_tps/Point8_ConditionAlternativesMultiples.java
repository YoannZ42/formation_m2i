package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point8_ConditionAlternativesMultiples {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Veuillez entrer une langue : ");
        var langue = input.nextLine();
        langue=langue.toLowerCase();

        // Si la langue = "Anglais", afficher "Hello"
        // Sinon si la langue = "Français", afficher "Salut"
        // Sinon si la langue = "Allemand" afficher "Guten tag"
        // Sinon si la langue = "Espagnol". afficher "Holla"
        // Sinon, afficher "Langue non supportée"
        if (langue.equals("anglais")) {
            System.out.println("Hello");
        } else if (langue.equals("français")) {
            System.out.println("Salut");
        } else if (langue.equals("allemand")) {
            System.out.println("Guten tag");
        } else if (langue.equals("espagnol")) {
            System.out.println("Holla");
        } else {
            System.out.println("Langue non supportée");
        }
    }
}

//Anglais => anglais

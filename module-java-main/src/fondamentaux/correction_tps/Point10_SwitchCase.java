package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point10_SwitchCase {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Veuillez entrer une langue : ");
        var langue = input.nextLine();
        langue=langue.toLowerCase();
        switch (langue){
            case "anglais":
                System.out.println("Hello");
                break;
            case "français":
                System.out.println("Salut");
                break;
            case "allemand":
                System.out.println("Guten tag");
                break;
            case "espagnol":
                System.out.println("Holla");
                break;
            default:
                System.out.println("Langue non supportée");
        }
    }
}

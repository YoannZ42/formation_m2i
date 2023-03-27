package fondamentaux.correction_tps.mardi_17;

import java.util.Scanner;

public class Tp1_CodePinV2 {


    public static void main(String[] args) {
        final int CODE_PIN_LENGTH = 4;
        final int MAX_ATTEMPTS = 5;
        Scanner input = new Scanner(System.in);

        int codePin = 0;
        int attempts = 0;

        do {
            System.out.print("Veuillez définir un code PIN de " + CODE_PIN_LENGTH + " chiffres : ");
            if (input.hasNextInt()) {
                codePin = input.nextInt();
                if (Integer.toString(codePin).length() == CODE_PIN_LENGTH) {
                    break;
                }
            } else {
                input.nextLine();
            }
            System.out.println("Erreur. Le code PIN doit être composé de " + CODE_PIN_LENGTH + " chiffres.");
        } while (true);

        do {
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
            if (input.hasNextInt()) {
                int codePinATester = input.nextInt();
                attempts++;
                if (codePinATester == codePin) {
                    System.out.println("Appareil débloqué");
                    break;
                }
            } else {
                input.next();
            }
            System.out.println("Code PIN incorrect. Veuillez ressayer.");

            if (attempts >= MAX_ATTEMPTS) {
                System.out.printf("Vous avez saisi %d fois de mauvais code PIN, votre compte est bloqué.\n", attempts);
                break;
            } else if (attempts >= 3) {
                System.out.printf("Il vous reste %d tentative(s).", MAX_ATTEMPTS - attempts);
            }
        } while (true);
    }
}
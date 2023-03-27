package fondamentaux.correction_tps.mardi_17;

import java.util.Scanner;

public class Tp1_CodePin {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        int codePin;

        String codePinStr;

       do {
           System.out.print("Veuillez définir un code PIN : ");
           codePin=input.nextInt();
           codePinStr=Integer.toString(codePin);
           if(codePinStr.length()==4){
              break;
           }
           System.out.println("Erreur.Le code PIN doit être composé de 4 chiffres");
       }while (true);

        int codePinATester;
        int nombreDeTentatives=0;
        do{
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
            codePinATester=input.nextInt();
            nombreDeTentatives++;
            if(codePin==codePinATester){
                System.out.println("Appareil débloqué");
                break;
            }
            System.out.println("Code PIN incorrect. Veuillez ressayer.");

            if(nombreDeTentatives==5){
                System.out.printf("Vous avez saisi %d fois de mauvais code PIN, votre " +
                        "compte est bloqué.\n",nombreDeTentatives);
                break;
            }

            if(nombreDeTentatives>=3){
                System.out.printf("Il vous reste %d tentative(s).",
                        (5-nombreDeTentatives));
            }

        } while (true);
    }
}

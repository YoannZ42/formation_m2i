package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point9_OperateursLogiques {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        // ET/AND : &&
        // OU/OR : ||
        System.out.print("Veuillez entrer le montant que vous pouvez payer pour un " +
                "abonnement: ");
        var montant=input.nextDouble();
        // Entre 5 et 10, le service offert est le "premium"
        // Entre 11 et 20, le service offert est le "Premium plus"
        // Entre 21 et 30, le service offert est le "Platinium"
        // Entre 31 et 40, le service offert est le "Gold"
        // à partir de 41€,  le servoce offert est "Diamond"
        if(montant<5){
            System.out.println("Dégage, il faut avoir de l'argent!!");
        }
        else if(montant>=5 && montant<=10){
            System.out.println("Votre souscription est : `Premium`");
        } else if (montant>=11 && montant<=20) {
            System.out.println("Votre souscription est : `Premium+`");
        } else if (montant>=21 && montant<=30) {
            System.out.println("Votre souscription est : `Platinium`");
        } else if (montant>=31 && montant<40){
            System.out.println("Votre souscription est : `Gold`");
        }else{
            System.out.println("Votre souscription est : `Diamond`");
        }
    }
}

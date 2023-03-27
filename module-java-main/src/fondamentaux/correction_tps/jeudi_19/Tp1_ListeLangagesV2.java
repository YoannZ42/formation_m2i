package fondamentaux.correction_tps.jeudi_19;

import java.util.HashSet;
import java.util.Scanner;

public class Tp1_ListeLangagesV2 {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        var programmingLanguages=new HashSet<String>();
        System.out.println("Veillez ajouter les langages de programmation : ");
        while (true){
            String value="";
            do {
                value=input.nextLine().toLowerCase();
                if(value.equals("")){
                    System.out.println("Vous n'avez rien saisi.Veuillez recommencer.");
                }
            }while (value.equals(""));

            if(value.equals("stop")){
                if(programmingLanguages.isEmpty()){
                    System.out.println("Vous devez ajouter au moins un langage.");
                    continue;
                }
                break;
            }
            programmingLanguages.add(value);
        }

        System.out.printf("Avant suppression : %s\n",programmingLanguages);
        System.out.println("Veuillez entrer les langages à supprimer : ");
        while (true){
            String value="";
            do {
                value=input.nextLine().toLowerCase();
                if(value.equals("")){
                    System.out.println("Vous n'avez rien saisi.Veuillez recommencer.");
                }
            }while (value.equals(""));

            if(value.equals("stop")){
                break;
            }
            if(programmingLanguages.contains(value)){
                programmingLanguages.remove(value);
            }else{
                System.out.printf("%s n'existe pas de la liste des langages.\n",value);
            }

            if(programmingLanguages.isEmpty()){
                System.out.println("Il ne reste plus rien :D");
                break;
            }
        }
        System.out.printf("Après suppression : %s\n",programmingLanguages);
    }
}

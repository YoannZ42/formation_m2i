package fondamentaux.correction_tps;

import java.util.ArrayList;
import java.util.Scanner;

public class Point22_NoteCoursTableauxDynamiques {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        int notes;

        do{
            System.out.print("Combien des notes voulez-entrer?");
            notes=input.nextInt();
            if(notes>0){
                break;
            }
            System.out.println("Erreur:Vous uniquement entrer des valeurs positives");
        }while (true);

        ArrayList<Double> notesCours=new ArrayList<>();
        for(int i=0;i<notes;i++){
            do{
                System.out.printf("Entrez note %d : ",(i+1));
                var noteAInserer=input.nextDouble();
                if(noteAInserer>=0 && noteAInserer<=20){
                    notesCours.add(noteAInserer);
                    break;
                }
                System.out.println("La note doit être entre 0 et 20");
            }while (true);
        }

        System.out.println(notesCours);

        var somme=0.0;
        for(int i=0;i<notesCours.size();i++){
            somme += notesCours.get(i);
        }

        var moyenne=somme/notesCours.size();

        System.out.printf("Somme : %.2f\nMoyenne : %.2f\n",somme,moyenne);

    }
}

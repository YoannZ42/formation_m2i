package fondamentaux.correction_tps.mardi_17;

import java.util.Scanner;

// 1. Demander de spécifier le nombres de notes à saisir
// 2. Saisir les notes à partir du clavier en sachant que les notes doivent se situer
// entre 0 et 20
// 3. Afficher la somme
// 4. Afficher la moyenne
public class Tp2_NoteCours {
    public static void main(String[] args) {
         var input=new Scanner(System.in);
        System.out.print("Nombre de notes à saisir : ");
        int nombreNotes;
        do{
            nombreNotes=input.nextInt();
            if (nombreNotes>0){
                System.out.println("");
                break;
            }
            System.out.println("La valeur du nombre de note doit être > 0");
        }while (true);

        double[] notesCoursPhysique=new double[nombreNotes];//
        for(int i=0;i<notesCoursPhysique.length;i++){

            do{
                System.out.printf("Saisir la note %d : ",(i+1));
                double note=input.nextDouble();
                notesCoursPhysique[i]=note;
                if(note>=0 || note<=20){
                   break;
                }
                System.out.println("Les notes saisies doivent se situer entre 0 et " +
                        "20");
            }while (true);
        }

        double sommeNotes=0;
        for (double note : notesCoursPhysique) {
            sommeNotes = sommeNotes + note;
        }

        double moyenne=sommeNotes/notesCoursPhysique.length;

        System.out.printf("Somme : %.1f\n",sommeNotes);
        System.out.printf("Moyenne : %.1f\n",moyenne);

    }
}

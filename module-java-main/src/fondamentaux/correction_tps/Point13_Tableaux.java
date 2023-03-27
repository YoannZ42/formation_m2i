package fondamentaux.correction_tps;

public class Point13_Tableaux {
    public static void main(String[] args) {
//        var note1ElevePhysique=12;
//        var note2ElevePhysique=16;
//        var note3ElevePhysique=14;
//        var note4ElevePhysique=10;
//        var note5ElevePhysique=19;
//        var note6ElevePhysique=18;
//
//        var sommeNotesPhysique=
//                note1ElevePhysique+note2ElevePhysique+note3ElevePhysique+note4ElevePhysique+note5ElevePhysique+note6ElevePhysique;
//
//        var moyenne=(double)sommeNotesPhysique/6;
//
//        System.out.printf("Somme : %d\nMoyenne : %.2f",sommeNotesPhysique,moyenne);


        // 0 : 12
        // 1 : 16
        // 2 : 14
        // 3 : 10
        // 4 : 19
        double[] notesCoursPhysique={12,16,14,10,19};//
        for(int i=0;i<=4;i++){
            // i = 0, notesCoursPhysique[0] => 12
            // i = 1, notesCoursPhysique[1] => 16
            // i = 2, notesCoursPhysique[2] => 14
            // i = 3, notesCoursPhysique[3] => 10
            // i = 4, notesCoursPhysique[4] => 19
            System.out.println(notesCoursPhysique[i]);
        }

        double sommeNotes=0;
        for(int i=0;i<notesCoursPhysique.length;i++){
            // i = 0, sommeNotes=sommeNotes+notesCoursPhysique[0] = 0 + 12 = 12
            // i = 1, sommeNotes=sommeNotes+notesCoursPhysique[1] = 12 + 16 = 28
            // i = 2, sommeNotes=sommeNotes+notesCoursPhysique[2] = 28 + 14 = 42
            // i = 3, sommeNotes=sommeNotes+notesCoursPhysique[3] = 42 + 10 = 52
            // i = 4, sommeNotes=sommeNotes+notesCoursPhysique[4] = 52 + 19 = 71
            sommeNotes=sommeNotes+notesCoursPhysique[i];
        }

        double moyenne=sommeNotes/notesCoursPhysique.length;

        System.out.printf("Somme : %.1f\n",sommeNotes);
        System.out.printf("Moyenne : %.1f\n",moyenne);


        int[] nombres=new int[4];// {0,0,0,0}
        nombres[0]=12;// {12,0,0,0}
        nombres[1]=17;// {12,17,0,0}
        nombres[2]=23;// {12,17,23,0}
        nombres[3]=40;// {12,17,23,40}
    }
}

// 1. Demander de spécifier le nombres de notes à saisir
// 2. Saisir les notes à partir du clavier en sachant que les notes doivent se situer
// entre 0 et 20
// 3. Afficher la somme
// 4. Afficher la moyenne

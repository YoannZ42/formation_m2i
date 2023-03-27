package fondamentaux.correction_tps;

public class Point2_Affichage {
    public static void main(String[] args) {
        String firstName="Christian";
        String lastName="Lisangola";
        int age=30;
        double poids=34.5;
        System.out.println("Je suis "+firstName+" "+lastName+", et j'ai "+age+" ans.");
        System.out.printf("Je suis %s %s,j'ai %d ans, et je pèse %.3f Kg.",firstName,
                lastName,
                age,poids);
    }
}

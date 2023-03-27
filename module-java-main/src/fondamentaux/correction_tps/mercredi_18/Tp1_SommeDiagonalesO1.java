package fondamentaux.correction_tps.mercredi_18;

public class Tp1_SommeDiagonalesO1 {
    public static void main(String[] args) {
        int[][] matrice = {{4, 5, 6}, {1, 8, 9}, {7, 9, 3}};
        int sommeDiagonale1 = matrice[0][0] + matrice[1][1] + matrice[2][2];
        int sommeDiagonale2 = matrice[0][2] + matrice[1][1] + matrice[2][0];
        int somme = sommeDiagonale1 + sommeDiagonale2;
        System.out.println("Somme des diagonales: " + somme);
    }
}

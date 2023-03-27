package fondamentaux.correction_tps.mercredi_18;

public class Tp1_SommeDiagonalesOn {
    public static void main(String[] args) {
        int[][] matrice = {{4, 5, 6}, {1, 8, 9}, {7, 9, 3}};
        int sommeDiagonale1 = 0;
        int sommeDiagonale2 = 0;

        for (int i = 0; i < matrice.length; i++) {
            sommeDiagonale1 += matrice[i][i];
            sommeDiagonale2 += matrice[i][matrice.length - i - 1];
        }

        int somme = sommeDiagonale1 + sommeDiagonale2;
        System.out.println("Somme des diagonales: " + somme);
    }
}

package fondamentaux.correction_tps.mercredi_18;

public class Tp1_SommeDiagonalesOn2 {
    public static void main(String[] args) {
        int[][] matrice = {{4, 5, 6}, {1, 8, 9}, {7, 9, 3}};
        int sommeDiagonale1 = 0;
        int sommeDiagonale2 = 0;

        for (int i = 0; i < matrice.length; i++) {
            for(int j=0;j< matrice.length;j++){
                if(i==j){
                    sommeDiagonale1 += matrice[i][j];
                    sommeDiagonale2 += matrice[i][matrice.length - i - 1];
                }
            }
        }

        int somme = sommeDiagonale1 + sommeDiagonale2;
        System.out.println("Somme des diagonales: " + somme);
    }
    }


package fondamentaux.correction_tps;

public class Point17_Tableau2ADimensionsSuite {
    public static void main(String[] args) {

        var tableau2D=new int[][]{
                {1,3,5,7},//0
                {2,4},// 1
                {8,10,12,5,11,15,2}// 2
        };


        for(int i=0;i<tableau2D.length;i++){
            for(int j=0;j<tableau2D[i].length;j++){
                System.out.printf("Tableau[%d][%d] : %d\n\n",i,j,tableau2D[i][j]);
            }
        }
    }
}

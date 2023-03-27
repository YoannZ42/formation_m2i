package fondamentaux.correction_tps.jeudi_19;

public class Tp3_2dArrayRepetitions {
    static String repete(int[][] arr,int number){
        int count=0;
        String emplacements="";
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==number){
                    count +=1;
                    emplacements =emplacements+String.format("(%d,%d)",i,j);
                }
            }
        }
        return String.format("%d %s",number,count>0?" est répété "+count+" fois, " +
                "dans " +
                "les positions "+emplacements:"n" +
                "'existe pas de la tableau");
    }
    public static void main(String[] args) {
        int[][] matrix={{1, 4, 2, 1},{6, 3, 8, 9}, {1, 5, 1, 0}};
        System.out.println(repete(matrix,1));
    }
}

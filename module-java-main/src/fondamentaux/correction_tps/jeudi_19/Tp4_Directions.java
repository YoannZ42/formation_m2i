package fondamentaux.correction_tps.jeudi_19;

import java.util.Arrays;

public class Tp4_Directions {
    static int[] direction(String[] directionStr){
        int[] result={0,0};
        for(int i=0;i<directionStr.length;i++){
            switch (directionStr[i]){
                case "haut":
                    result[1] +=1;
                    break;
                case "bas":
                    result[1] -=1;
                    break;
                case "gauche":
                    result[0] -=1;
                    break;
                case "droite":
                    result[0] +=1;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] directions={"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        System.out.println(Arrays.toString(direction(directions)));
    }
}

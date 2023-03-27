package fondamentaux.correction_tps;

public class Point11_For {
    public static void main(String[] args) {
//        System.out.printf("Le carré de %d est %.1f\n",2,Math.pow(2,2));
//        System.out.printf("Le carré de %d est %.1f\n",3,Math.pow(3,2));
//        System.out.printf("Le carré de %d est %.1f\n",4,Math.pow(4,2));

        // Carré de tous les nombres en partant de 2 jusqu'à 100
        // on commence où? 2
        // on s'arrête où? 100
        // On avance de combien de pas ? 1
        // nombre=nombre+1
        // nombre +=1
        // nombre++
        for(int nombre=2;nombre<=100;nombre++){
            System.out.printf("Le carré de %d est %.1f\n.",nombre,Math.pow(nombre,2));
        }
    }
}

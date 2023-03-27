package fondamentaux.correction_tps;

public class Point24_Fonctions {
    static double calculSurface(double rayon){
        return Math.pow(rayon,2)*Math.PI;
    }

    static double calculSomme(double nombre1, double nombre2){
        return nombre1+nombre2;
    }

    public static void main(String[] args){
       double surface=calculSurface(40);
       System.out.println(calculSomme(4,5));
    }
}

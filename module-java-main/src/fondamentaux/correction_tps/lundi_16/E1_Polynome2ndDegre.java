package fondamentaux.correction_tps.lundi_16;

public class E1_Polynome2ndDegre {
    public static void main(String[] args) {
        double a=1;
        double b=2;
        double c=3;
        double x=3.5;

        double partie1=((a+b)/2)*Math.pow(x,3);
        double partie2=Math.pow((a+b),2)*Math.pow(x,2);
        double polynome=partie1+partie2+a+b+c;
        System.out.printf("Polynôme : %f",polynome);
    }
}

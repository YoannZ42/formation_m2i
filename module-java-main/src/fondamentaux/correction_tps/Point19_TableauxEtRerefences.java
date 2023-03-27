package fondamentaux.correction_tps;

public class Point19_TableauxEtRerefences {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

//        Nouveau tableau en mémoire
        int[] b={1,2,3,4,5};

//        int[] b=a;

        System.out.println(a);
        System.out.println(b);

        if(a==b){
            System.out.println("vrai");
        }else {
            System.out.println("Faux");
        }
    }
}

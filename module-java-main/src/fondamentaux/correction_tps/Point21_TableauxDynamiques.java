package fondamentaux.correction_tps;

import java.util.ArrayList;

public class Point21_TableauxDynamiques {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        System.out.printf("Taille du tableau : %d\n",fruits.size());

        fruits.add("pommes");
        fruits.add("bananes");
        fruits.add("oranges");

        System.out.printf("Taille du tableau : %d\n",fruits.size());

        System.out.println("1. Boucle 1\n=========");
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

        fruits.add("ananas");

        System.out.println("2. Boucle 2\n=========");
        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }

    }
}

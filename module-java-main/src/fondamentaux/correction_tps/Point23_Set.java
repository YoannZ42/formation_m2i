package fondamentaux.correction_tps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Point23_Set {
    public static void main(String[] args) {
        ArrayList<Integer> nombres=new ArrayList<>();
        nombres.add(1);
        nombres.add(2);
        nombres.add(3);
        nombres.add(3);
        nombres.add(1);
        System.out.println(nombres);

        HashSet<Integer> nombres2=new HashSet<>();
        nombres2.add(1);
        nombres2.add(2);
        nombres2.add(3);
        nombres2.add(3);
        nombres2.add(1);
        System.out.println(nombres2);
    }
}

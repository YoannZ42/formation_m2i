package poo.jeux_video;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JeuxVideo {
    public static void main(String[] args) {
        var moi=new Guerrier("Tonton cricri","Kalashnikov AK-47",100);
        var geoffrey=new Magicien("Geoffrey",90,"Baguette de Geoffrey");
        var marina=new Sorcier("Maria",90,"Baguette de Marin","Baton Mathématique");
//        var jean=new Personnage("Jean Zozor",56);

        System.out.println(moi);

        ArrayList<String> fruits=new ArrayList<>(Arrays.asList("pomme","banane","ananas"));
        System.out.println(fruits);
    }
}

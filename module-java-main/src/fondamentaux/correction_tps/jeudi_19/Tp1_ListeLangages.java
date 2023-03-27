package fondamentaux.correction_tps.jeudi_19;

import java.util.HashMap;
import java.util.HashSet;

public class Tp1_ListeLangages {
    public static void main(String[] args) {
        HashMap<String,String> langagesMap=new HashMap<>();
        //On peut demander à l'utilisateur d'entrer ces valeurs à partir du clavier
        langagesMap.put("java","java");
        langagesMap.put("python","python");
        langagesMap.put("c++","c++");
        langagesMap.put("ruby","ruby");
        langagesMap.put("php","php");
        langagesMap.put("go","go");
        langagesMap.put("typescript","typescript");


        HashSet<String> langagesToRemove=new HashSet<>();
        //On peut demander à l'utilisateur d'entrer ces valeurs à partir du clavier
        langagesToRemove.add("java".toLowerCase());
        langagesToRemove.add("c++".toLowerCase());

        System.out.println("With MAP\n==============================");
        System.out.println("Before remove:with-map => : "+langagesMap);
        for(String lang:langagesToRemove){
            langagesMap.remove(lang);
        }
        System.out.println("After remove:with-map => : "+langagesMap);

    }

}

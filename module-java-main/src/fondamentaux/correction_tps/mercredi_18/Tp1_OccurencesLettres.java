package fondamentaux.correction_tps.mercredi_18;

import java.util.HashMap;
import java.util.Map;

public class Tp1_OccurencesLettres {
    public static void main(String[] args) {
        String phrase="Je suis dans une joie immense.Et je sais que vous aussi.";

        String formattedPhrase=phrase.replaceAll("[^A-Z-a-z]","").toLowerCase();
        HashMap<Character,Integer> charMap=new HashMap<>();
        for(String lettre:formattedPhrase.split("")){
            char lettreToChar=lettre.charAt(0);
            if(charMap.containsKey(lettreToChar)){
                charMap.replace(lettreToChar,charMap.get(lettreToChar)+1);
            }else{
                charMap.put(lettreToChar,1);
            }
        }

        for(Map.Entry<Character,Integer> entry:charMap.entrySet()){
            char key=entry.getKey();
            int value=entry.getValue();
            System.out.printf("%s : %d fois\n",key,value);
        }

    }
}

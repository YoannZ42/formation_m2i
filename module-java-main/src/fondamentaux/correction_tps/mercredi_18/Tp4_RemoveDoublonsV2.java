package fondamentaux.correction_tps.mercredi_18;

import java.util.Arrays;
import java.util.HashSet;

public class Tp4_RemoveDoublonsV2 {
    public static void main(String[] args) {
        String phrase = "Je suis dans la joie";
        String phraseWithoutSpecialChars =
                phrase.replaceAll("[^A-Za-z]", "").toLowerCase();
        String[] phraseCharArray=phraseWithoutSpecialChars.split("");

//        System.out.println(Arrays.toString(phraseCharArray));

        HashSet<String> stringHashSet = new HashSet<>(Arrays.asList(phraseCharArray));
        System.out.println(stringHashSet);

        String phraseWithoutDoublons=String.join("",stringHashSet);

        System.out.println(phraseWithoutSpecialChars);
        System.out.println(phraseWithoutDoublons);
    }
}

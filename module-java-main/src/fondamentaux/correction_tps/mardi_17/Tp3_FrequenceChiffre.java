package fondamentaux.correction_tps.mardi_17;

import java.util.HashMap;

public class Tp3_FrequenceChiffre {
    public static void main(String[] args) {
        byte[] chiffres={2, 7, 5, 6, 7, 1, 6, 2, 1, 7,1,32,1};
        HashMap<Byte,Integer> occurences=new HashMap<>();
        for(byte chiffre:chiffres){
            if(occurences.containsKey(chiffre)){
                occurences.replace(chiffre,occurences.get(chiffre)+1);
            }else{
                occurences.put(chiffre,1);
            }
        }
        System.out.println(occurences);

        int occurence=0;
        byte nombre=0;
        for(byte chiffre:chiffres){
            if(occurences.get(chiffre)>occurence){
                nombre=chiffre;
                occurence=occurences.get(chiffre);
            }
        }
        System.out.printf("Le nombre qui se répète le plus souvent est %d , il est " +
                "répété %d fois",nombre,occurence);
    }
}

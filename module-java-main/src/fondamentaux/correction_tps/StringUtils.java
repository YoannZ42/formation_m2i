package fondamentaux.correction_tps;

public class StringUtils {
    static String capitalize(String text){
        String capitalized=String.valueOf(text.charAt(0)).toUpperCase();
        String[] strToArr=text.split("");
        for(int i=1;i<strToArr.length;i++){
            if(strToArr[i-1].equals(" ")){
                capitalized +=strToArr[i].toUpperCase();
            }else{
                capitalized +=strToArr[i];
            }
        }
        return capitalized;
    }

    static String getIntialChars(String text){
            String capitalizedText=capitalize(text);
            String[] textArray=capitalizedText.split(" ");
            String initials="";
            for(String word:textArray){
                initials +=word.charAt(0);
            }

            return initials;
    }
}


//["Christian","Lisangola"]
// word = "Christian" => word.charAt(0) => C
//  initial="C"
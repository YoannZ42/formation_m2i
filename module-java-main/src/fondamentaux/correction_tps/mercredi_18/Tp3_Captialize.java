package fondamentaux.correction_tps.mercredi_18;

public class Tp3_Captialize {
    public static void main(String[] args) {
        String str="a cet apres-midi";
        System.out.println(str);
        String capitalized=String.valueOf(str.charAt(0)).toUpperCase();
        String[] strToArr=str.split("");
        for(int i=1;i<strToArr.length;i++){
            if(strToArr[i-1].equals(" ")){
                capitalized +=strToArr[i].toUpperCase();
            }else{
                capitalized +=strToArr[i];
            }
        }
        System.out.println(capitalized);
    }
}

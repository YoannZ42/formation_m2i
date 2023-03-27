package fondamentaux.correction_tps.mercredi_18;

public class Tp2_ReverseIntV1 {
    public static void main(String[] args) {
        int number=100;
        String numberToStr=Integer.toString(number).replaceAll("[^0-9]","");//retirer le "-"

        StringBuilder reversedStr= new StringBuilder();
        for(String letter:numberToStr.split("")){
            reversedStr.insert(0, letter);
        }

        int reversedToInt=(int) (Integer.parseInt(reversedStr.toString())*Math.signum(number));
        System.out.println(reversedToInt);
    }
}

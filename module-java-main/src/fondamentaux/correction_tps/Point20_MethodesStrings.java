package fondamentaux.correction_tps;

public class Point20_MethodesStrings {
    public static void main(String[] args) {
        String name="Christian Lisangola";
        System.out.println(name.charAt(1));
        int taille=name.length();
        System.out.println("Dernier caractère : "+name.charAt(taille-1));
        System.out.println("Taille : "+name.length());
        System.out.println(name.replaceAll("i","*"));
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}

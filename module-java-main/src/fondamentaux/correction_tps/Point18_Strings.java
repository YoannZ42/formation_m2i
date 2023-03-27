package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point18_Strings {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        String a="Chris";
        String b="Chris";

        System.out.print("a == b : ");
        if(a==b){
            System.out.print("vrai");
        }else {
            System.out.print("Faux");
        }

        System.out.print("\n\n");

        String c=input.nextLine();

//        c=c.intern();
        System.out.print("a == c : ");
        if(a==c){
            System.out.print("vrai");
        }else {
            System.out.print("Faux");
        }
    }
}

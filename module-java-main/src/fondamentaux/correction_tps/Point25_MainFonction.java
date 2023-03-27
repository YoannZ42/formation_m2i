package fondamentaux.correction_tps;

import java.util.ArrayList;
import java.util.Scanner;

public class Point25_MainFonction {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        var name=input.nextLine();
        var nameCapitalizedName=StringUtils.capitalize(name);

        System.out.println(nameCapitalizedName);

        var accountName="geoffrey cabasson";

        System.out.println(StringUtils.getIntialChars(accountName));

        ArrayList<String> a=new ArrayList<>();
    }
}

// christian lisangola
// => Christian Lisangola
// => CL
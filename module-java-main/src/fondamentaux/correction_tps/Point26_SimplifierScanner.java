package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point26_SimplifierScanner {
    static void print(String text){
        System.out.print(text);
    }

    static void println(String text){
        System.out.println(text);
    }

    static void printf(String text,Object ...obj){
        System.out.printf(text,obj);
    }
    static String textInput(String message){
       System.out.print(message);
       return new Scanner(System.in).nextLine();
    }

    static int intInput(String message){
        System.out.print(message);
        return new Scanner(System.in).nextInt();
    }
    public static void main(String[] args) {
       var nom=textInput("Votre nom : ");
       var prenom=textInput("Votre prenom: ");
       var age=intInput("Votre age : ");
       printf("Nom : %s\nPrenom : %s\nAge: %d\n",nom,prenom,age);
        println("Bonsoir");
        print("Bonjour");
    }
}



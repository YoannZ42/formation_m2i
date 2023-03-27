package poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("b doit toujours être non nul");
        }
        return a/b;
    }

    public static void main(String[] args) {
//        System.out.print("Entrez votre age: ");
//        try {
//            int age=new Scanner(System.in).nextInt();
//            System.out.printf("Age : %d",age);
//        }catch (InputMismatchException e){
//            System.out.println("Erreur -> "+e);
//            System.out.println("L'age doit être un entier");
//        }
       try {
           System.out.println(divide(10,0));
       }catch (ArithmeticException e){
           System.out.println("Erreur -> "+e);
       }



    }
}

package fondamentaux.correction_tps.lundi_16;

import java.util.Scanner;

public class E2_SigneNombre {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        byte nombre=clavier.nextByte();
        boolean estPair=nombre%2==0;
        String parite=estPair?"pair":"impair";
        if(nombre>0){
            System.out.printf("%d est posifif et %s",nombre,parite);
        }else if(nombre<0){
            System.out.printf("%d est négatif et %s",nombre,parite);
        }else{
            System.out.println("0 et pair");
        }
    }
}

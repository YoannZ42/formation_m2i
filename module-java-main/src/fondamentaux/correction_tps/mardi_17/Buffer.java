package fondamentaux.correction_tps.mardi_17;

import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
//        System.out.println("Entrez 3 nombres : ");
//        var a=input.nextInt();
//        var b=input.nextInt();
//        var c=input.nextInt();
//
//        System.out.printf("A : %d\nB : %d\nC : %d",a,b,c);
        final int NOMBRE_TENTATIVES=5;
        final int TAILLE_CODE_PIN=4;

        String  codePin;
        do{
            System.out.print("Entrez un code PIN : ");
            if(input.hasNextInt()){// false
                codePin=input.next();
                if(codePin.length()==TAILLE_CODE_PIN){
                    break;
                }
            }else{
                input.nextLine();
            }
            System.out.println("Erreur: Le code PIN doit être composé de 4 chiffres");
        }while (true);
    }
}

// 134abc
package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point12_BoucleWhile {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Veuillez définir un code PIN : ");
        var codePin=input.nextInt();

//        1. Version avec while
//        int codePinATester=1111;
//
//        while (codePinATester!=codePin){
//            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
//            codePinATester=input.nextInt();
//            if(codePin!=codePinATester){
//                System.out.println("Code PIN incorrect. Veuillez ressayer.");
//            }
//        }


//        2. Version avec do while
//
//        int codePinATester;
//
//       do{
//            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
//            codePinATester=input.nextInt();
//            if(codePin!=codePinATester){
//                System.out.println("Code PIN incorrect. Veuillez ressayer.");
//            }
//        } while (codePinATester!=codePin);


//        3. Version avec do while avec break

        int codePinATester;

        do{
            System.out.print("Veuillez entrer un code PIN pour débloquer l'appareil : ");
            codePinATester=input.nextInt();
            if(codePin==codePinATester){
                System.out.println("Appareil débloqué");
                break;
            }
            System.out.println("Code PIN incorrect. Veuillez ressayer.");

        } while (true);
    }
}

// 1. Limiter de nombre de tentatives à 5.
// 2. Au bout de 5 tentatives, bloquer l'appareil
// 3. Lorsqu'on définit un code PIN, on doit seulement avoir 4 chiffres. Tant que cette
// condition n'est pas respectée, demander à l'utilisateur de recommencer.
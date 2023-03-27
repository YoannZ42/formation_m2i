package fondamentaux.correction_tps;

import java.util.Scanner;

public class Point11_ExoFacto {
    public static void main(String[] args) {
        var input=new Scanner(System.in);

        System.out.print("Entrez le nombre dont vous voulez connaître la factorielle : ");
        var nombre=input.nextInt();
        var factorielle=1;
        for(int i=1;i<=nombre;i++){
            System.out.printf("%d",i);
            factorielle *=i;
            if(i==nombre){
                System.out.printf(" = ");
            }else{
                System.out.printf(" * ");
            }
        }
        System.out.printf("%d",factorielle);
    }
}

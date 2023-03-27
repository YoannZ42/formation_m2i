package fondamentaux.correction_tps.mercredi_18;

import java.util.Scanner;

public class Tp2_ReverseIntV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Votre nombre : ");
        int nombre = sc.nextInt();
        int inverse = 0;
        int temp = nombre;
        while (temp != 0) {
            inverse = inverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Résultat : " + inverse);
    }
}

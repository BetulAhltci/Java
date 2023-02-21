package day05_ifStatements;

import java.util.Scanner;

public class C04_ifstatements {
    public static void main(String[] args) {
         /* kullanıcan bir sayı alın
        sayı 3 ile bölünebiliyorsa " üç ile bölünebilen sayı"
        5 ile bölünebiliyorsa "beş ile bölünebilen sayı" yazdır
        */

        // eğer if body si için yazılacak kod bir satırdan fazlaysa {} kullanılmalıdır

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı= scan.nextInt();

        if (sayı%3==0){
            System.out.println("üç ile bölünebilen sayı");
        }
        if (sayı%5==0){
            System.out.println("beş ile bölunebilen sayı");
        }
    }
}
